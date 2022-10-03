package org.test.InxeptionEstimatedHours.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "product_url", "keywords", "breadth", "thickness", "discount", "taxonomy", "number_of_reviews",
		"delivery_time", "large_quantity", "data_source_subcategory", "price", "product_id", "supplier",
		"wattage_per_panel", "dimension_or_size", "brand", "module_per_container", "power_range",
		"universal_part_number", "image_url", "data_source", "name", "cid", "commercial_residential", "color",
		"certificate", "description", "created_at", "protection", "manufacturer", "cell_technology", "wattage",
		"updated_at", "module_per_pallet", "financing", "publication_date", "currency", "model_number", "is_active",
		"rebate", "length", "discount_filter", "data_source_type", "stars", "is_inxeption_product", "max_price",
		"min_price", "seller_alias", "imp_words" })
@Generated("jsonschema2pojo")
public class Source {

	@JsonProperty("product_url")
	private String productUrl;
	@JsonProperty("keywords")
	private String keywords;
	@JsonProperty("breadth")
	private String breadth;
	@JsonProperty("thickness")
	private String thickness;
	@JsonProperty("discount")
	private Object discount;
	@JsonProperty("taxonomy")
	private String taxonomy;
	@JsonProperty("number_of_reviews")
	private Object numberOfReviews;
	@JsonProperty("delivery_time")
	private String deliveryTime;
	@JsonProperty("large_quantity")
	private String largeQuantity;
	@JsonProperty("data_source_subcategory")
	private String dataSourceSubcategory;
	@JsonProperty("price")
	private String price;
	@JsonProperty("product_id")
	private String productId;
	@JsonProperty("supplier")
	private Object supplier;
	@JsonProperty("wattage_per_panel")
	private String wattagePerPanel;
	@JsonProperty("dimension_or_size")
	private Object dimensionOrSize;
	@JsonProperty("brand")
	private String brand;
	@JsonProperty("module_per_container")
	private Integer modulePerContainer;
	@JsonProperty("power_range")
	private Object powerRange;
	@JsonProperty("universal_part_number")
	private String universalPartNumber;
	@JsonProperty("image_url")
	private List<String> imageUrl = null;
	@JsonProperty("data_source")
	private String dataSource;
	@JsonProperty("name")
	private String name;
	@JsonProperty("cid")
	private String cid;
	@JsonProperty("commercial_residential")
	private String commercialResidential;
	@JsonProperty("color")
	private String color;
	@JsonProperty("certificate")
	private String certificate;
	@JsonProperty("description")
	private String description;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("protection")
	private String protection;
	@JsonProperty("manufacturer")
	private String manufacturer;
	@JsonProperty("cell_technology")
	private String cellTechnology;
	@JsonProperty("wattage")
	private Object wattage;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("module_per_pallet")
	private Integer modulePerPallet;
	@JsonProperty("financing")
	private String financing;
	@JsonProperty("publication_date")
	private Object publicationDate;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("model_number")
	private String modelNumber;
	@JsonProperty("is_active")
	private Boolean isActive;
	@JsonProperty("rebate")
	private String rebate;
	@JsonProperty("length")
	private String length;
	@JsonProperty("discount_filter")
	private String discountFilter;
	@JsonProperty("data_source_type")
	private String dataSourceType;
	@JsonProperty("stars")
	private Object stars;
	@JsonProperty("is_inxeption_product")
	private Boolean isInxeptionProduct;
	@JsonProperty("max_price")
	private Integer maxPrice;
	@JsonProperty("min_price")
	private Integer minPrice;
	@JsonProperty("seller_alias")
	private String sellerAlias;
	@JsonProperty("imp_words")
	private String impWords;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("product_url")
	public String getProductUrl() {
		return productUrl;
	}

	@JsonProperty("product_url")
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	@JsonProperty("keywords")
	public String getKeywords() {
		return keywords;
	}

	@JsonProperty("keywords")
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@JsonProperty("breadth")
	public String getBreadth() {
		return breadth;
	}

	@JsonProperty("breadth")
	public void setBreadth(String breadth) {
		this.breadth = breadth;
	}

	@JsonProperty("thickness")
	public String getThickness() {
		return thickness;
	}

	@JsonProperty("thickness")
	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	@JsonProperty("discount")
	public Object getDiscount() {
		return discount;
	}

	@JsonProperty("discount")
	public void setDiscount(Object discount) {
		this.discount = discount;
	}

	@JsonProperty("taxonomy")
	public String getTaxonomy() {
		return taxonomy;
	}

	@JsonProperty("taxonomy")
	public void setTaxonomy(String taxonomy) {
		this.taxonomy = taxonomy;
	}

	@JsonProperty("number_of_reviews")
	public Object getNumberOfReviews() {
		return numberOfReviews;
	}

	@JsonProperty("number_of_reviews")
	public void setNumberOfReviews(Object numberOfReviews) {
		this.numberOfReviews = numberOfReviews;
	}

	@JsonProperty("delivery_time")
	public String getDeliveryTime() {
		return deliveryTime;
	}

	@JsonProperty("delivery_time")
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	@JsonProperty("large_quantity")
	public String getLargeQuantity() {
		return largeQuantity;
	}

	@JsonProperty("large_quantity")
	public void setLargeQuantity(String largeQuantity) {
		this.largeQuantity = largeQuantity;
	}

	@JsonProperty("data_source_subcategory")
	public String getDataSourceSubcategory() {
		return dataSourceSubcategory;
	}

	@JsonProperty("data_source_subcategory")
	public void setDataSourceSubcategory(String dataSourceSubcategory) {
		this.dataSourceSubcategory = dataSourceSubcategory;
	}

	@JsonProperty("price")
	public String getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(String price) {
		this.price = price;
	}

	@JsonProperty("product_id")
	public String getProductId() {
		return productId;
	}

	@JsonProperty("product_id")
	public void setProductId(String productId) {
		this.productId = productId;
	}

	@JsonProperty("supplier")
	public Object getSupplier() {
		return supplier;
	}

	@JsonProperty("supplier")
	public void setSupplier(Object supplier) {
		this.supplier = supplier;
	}

	@JsonProperty("wattage_per_panel")
	public String getWattagePerPanel() {
		return wattagePerPanel;
	}

	@JsonProperty("wattage_per_panel")
	public void setWattagePerPanel(String wattagePerPanel) {
		this.wattagePerPanel = wattagePerPanel;
	}

	@JsonProperty("dimension_or_size")
	public Object getDimensionOrSize() {
		return dimensionOrSize;
	}

	@JsonProperty("dimension_or_size")
	public void setDimensionOrSize(Object dimensionOrSize) {
		this.dimensionOrSize = dimensionOrSize;
	}

	@JsonProperty("brand")
	public String getBrand() {
		return brand;
	}

	@JsonProperty("brand")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@JsonProperty("module_per_container")
	public Integer getModulePerContainer() {
		return modulePerContainer;
	}

	@JsonProperty("module_per_container")
	public void setModulePerContainer(Integer modulePerContainer) {
		this.modulePerContainer = modulePerContainer;
	}

	@JsonProperty("power_range")
	public Object getPowerRange() {
		return powerRange;
	}

	@JsonProperty("power_range")
	public void setPowerRange(Object powerRange) {
		this.powerRange = powerRange;
	}

	@JsonProperty("universal_part_number")
	public String getUniversalPartNumber() {
		return universalPartNumber;
	}

	@JsonProperty("universal_part_number")
	public void setUniversalPartNumber(String universalPartNumber) {
		this.universalPartNumber = universalPartNumber;
	}

	@JsonProperty("image_url")
	public List<String> getImageUrl() {
		return imageUrl;
	}

	@JsonProperty("image_url")
	public void setImageUrl(List<String> imageUrl) {
		this.imageUrl = imageUrl;
	}

	@JsonProperty("data_source")
	public String getDataSource() {
		return dataSource;
	}

	@JsonProperty("data_source")
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("cid")
	public String getCid() {
		return cid;
	}

	@JsonProperty("cid")
	public void setCid(String cid) {
		this.cid = cid;
	}

	@JsonProperty("commercial_residential")
	public String getCommercialResidential() {
		return commercialResidential;
	}

	@JsonProperty("commercial_residential")
	public void setCommercialResidential(String commercialResidential) {
		this.commercialResidential = commercialResidential;
	}

	@JsonProperty("color")
	public String getColor() {
		return color;
	}

	@JsonProperty("color")
	public void setColor(String color) {
		this.color = color;
	}

	@JsonProperty("certificate")
	public String getCertificate() {
		return certificate;
	}

	@JsonProperty("certificate")
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("protection")
	public String getProtection() {
		return protection;
	}

	@JsonProperty("protection")
	public void setProtection(String protection) {
		this.protection = protection;
	}

	@JsonProperty("manufacturer")
	public String getManufacturer() {
		return manufacturer;
	}

	@JsonProperty("manufacturer")
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@JsonProperty("cell_technology")
	public String getCellTechnology() {
		return cellTechnology;
	}

	@JsonProperty("cell_technology")
	public void setCellTechnology(String cellTechnology) {
		this.cellTechnology = cellTechnology;
	}

	@JsonProperty("wattage")
	public Object getWattage() {
		return wattage;
	}

	@JsonProperty("wattage")
	public void setWattage(Object wattage) {
		this.wattage = wattage;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("module_per_pallet")
	public Integer getModulePerPallet() {
		return modulePerPallet;
	}

	@JsonProperty("module_per_pallet")
	public void setModulePerPallet(Integer modulePerPallet) {
		this.modulePerPallet = modulePerPallet;
	}

	@JsonProperty("financing")
	public String getFinancing() {
		return financing;
	}

	@JsonProperty("financing")
	public void setFinancing(String financing) {
		this.financing = financing;
	}

	@JsonProperty("publication_date")
	public Object getPublicationDate() {
		return publicationDate;
	}

	@JsonProperty("publication_date")
	public void setPublicationDate(Object publicationDate) {
		this.publicationDate = publicationDate;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("model_number")
	public String getModelNumber() {
		return modelNumber;
	}

	@JsonProperty("model_number")
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	@JsonProperty("is_active")
	public Boolean getIsActive() {
		return isActive;
	}

	@JsonProperty("is_active")
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@JsonProperty("rebate")
	public String getRebate() {
		return rebate;
	}

	@JsonProperty("rebate")
	public void setRebate(String rebate) {
		this.rebate = rebate;
	}

	@JsonProperty("length")
	public String getLength() {
		return length;
	}

	@JsonProperty("length")
	public void setLength(String length) {
		this.length = length;
	}

	@JsonProperty("discount_filter")
	public String getDiscountFilter() {
		return discountFilter;
	}

	@JsonProperty("discount_filter")
	public void setDiscountFilter(String discountFilter) {
		this.discountFilter = discountFilter;
	}

	@JsonProperty("data_source_type")
	public String getDataSourceType() {
		return dataSourceType;
	}

	@JsonProperty("data_source_type")
	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
	}

	@JsonProperty("stars")
	public Object getStars() {
		return stars;
	}

	@JsonProperty("stars")
	public void setStars(Object stars) {
		this.stars = stars;
	}

	@JsonProperty("is_inxeption_product")
	public Boolean getIsInxeptionProduct() {
		return isInxeptionProduct;
	}

	@JsonProperty("is_inxeption_product")
	public void setIsInxeptionProduct(Boolean isInxeptionProduct) {
		this.isInxeptionProduct = isInxeptionProduct;
	}

	@JsonProperty("max_price")
	public Integer getMaxPrice() {
		return maxPrice;
	}

	@JsonProperty("max_price")
	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}

	@JsonProperty("min_price")
	public Integer getMinPrice() {
		return minPrice;
	}

	@JsonProperty("min_price")
	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}

	@JsonProperty("seller_alias")
	public String getSellerAlias() {
		return sellerAlias;
	}

	@JsonProperty("seller_alias")
	public void setSellerAlias(String sellerAlias) {
		this.sellerAlias = sellerAlias;
	}

	@JsonProperty("imp_words")
	public String getImpWords() {
		return impWords;
	}

	@JsonProperty("imp_words")
	public void setImpWords(String impWords) {
		this.impWords = impWords;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}