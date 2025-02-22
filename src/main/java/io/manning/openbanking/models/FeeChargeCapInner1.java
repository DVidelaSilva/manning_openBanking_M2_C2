package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OtherFeeTypeInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge
 */

@Schema(name = "FeeChargeCap_inner_1", description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
@JsonTypeName("FeeChargeCap_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class FeeChargeCapInner1 {

  /**
   * Fee/charge type which is being capped
   */
  public enum FeeTypeEnum {
    SERVICE_C_ACCOUNT_FEE("ServiceCAccountFee"),
    
    SERVICE_C_ACCOUNT_FEE_MONTHLY("ServiceCAccountFeeMonthly"),
    
    SERVICE_C_OTHER("ServiceCOther"),
    
    OTHER("Other");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeTypeEnum fromValue(String value) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  
  private List<FeeTypeEnum> feeType = new ArrayList<>();

  /**
   * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
   */
  public enum MinMaxTypeEnum {
    MINIMUM("Minimum"),
    
    MAXIMUM("Maximum");

    private String value;

    MinMaxTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MinMaxTypeEnum fromValue(String value) {
      for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MinMaxTypeEnum minMaxType;

  private Float feeCapOccurrence;

  private String feeCapAmount;

  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   */
  public enum CappingPeriodEnum {
    ACADEMIC_TERM("AcademicTerm"),
    
    DAY("Day"),
    
    HALF_YEAR("Half Year"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    YEAR("Year");

    private String value;

    CappingPeriodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CappingPeriodEnum fromValue(String value) {
      for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CappingPeriodEnum cappingPeriod;

  
  private List<String> notes = new ArrayList<>();

  
  private List<OtherFeeTypeInner> otherFeeType = new ArrayList<>();

  public FeeChargeCapInner1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeeChargeCapInner1(List<FeeTypeEnum> feeType, MinMaxTypeEnum minMaxType) {
    this.feeType = feeType;
    this.minMaxType = minMaxType;
  }

  public FeeChargeCapInner1 feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public FeeChargeCapInner1 addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    if (this.feeType == null) {
      this.feeType = new ArrayList<>();
    }
    this.feeType.add(feeTypeItem);
    return this;
  }

  /**
   * Fee/charge type which is being capped
   * @return feeType
   */
  @NotNull
  @Schema(name = "FeeType", description = "Fee/charge type which is being capped", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeType")
  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public FeeChargeCapInner1 minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
   * @return minMaxType
   */
  @NotNull
  @Schema(name = "MinMaxType", description = "Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MinMaxType")
  public MinMaxTypeEnum getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public FeeChargeCapInner1 feeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

  /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
   */
  
  @Schema(name = "FeeCapOccurrence", description = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeCapOccurrence")
  public Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public FeeChargeCapInner1 feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

  /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
   */
  
  @Schema(name = "FeeCapAmount", description = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeCapAmount")
  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public FeeChargeCapInner1 cappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   * @return cappingPeriod
   */
  
  @Schema(name = "CappingPeriod", description = "Period e.g. day, week, month etc. for which the fee/charge is capped", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CappingPeriod")
  public CappingPeriodEnum getCappingPeriod() {
    return cappingPeriod;
  }

  public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public FeeChargeCapInner1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeeChargeCapInner1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for adding  extra details for fee charge cap
   * @return notes
   */
  
  @Schema(name = "Notes", description = "Free text for adding  extra details for fee charge cap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeeChargeCapInner1 otherFeeType(List<OtherFeeTypeInner> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public FeeChargeCapInner1 addOtherFeeTypeItem(OtherFeeTypeInner otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

  /**
   * Other fee type code which is not available in the standard code set
   * @return otherFeeType
   */
  
  @Schema(name = "OtherFeeType", description = "Other fee type code which is not available in the standard code set", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeType")
  public List<OtherFeeTypeInner> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<OtherFeeTypeInner> otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeChargeCapInner1 feeChargeCapInner1 = (FeeChargeCapInner1) o;
    return Objects.equals(this.feeType, feeChargeCapInner1.feeType) &&
        Objects.equals(this.minMaxType, feeChargeCapInner1.minMaxType) &&
        Objects.equals(this.feeCapOccurrence, feeChargeCapInner1.feeCapOccurrence) &&
        Objects.equals(this.feeCapAmount, feeChargeCapInner1.feeCapAmount) &&
        Objects.equals(this.cappingPeriod, feeChargeCapInner1.cappingPeriod) &&
        Objects.equals(this.notes, feeChargeCapInner1.notes) &&
        Objects.equals(this.otherFeeType, feeChargeCapInner1.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeChargeCapInner1 {\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

