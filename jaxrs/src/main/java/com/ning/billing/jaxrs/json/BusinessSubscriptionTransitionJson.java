/*
 * Copyright 2010-2012 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.jaxrs.json;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import com.ning.billing.analytics.api.BusinessSubscriptionTransition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BusinessSubscriptionTransitionJson extends JsonBase {

    private final Long totalOrdering;
    private final String bundleId;
    private final String externalKey;
    private final String accountId;
    private final String accountKey;
    private final String subscriptionId;

    private final DateTime requestedTimestamp;
    private final String eventType;
    private final String category;

    private final String prevProductName;
    private final String prevProductType;
    private final String prevProductCategory;
    private final String prevSlug;
    private final String prevPhase;
    private final String prevBillingPeriod;
    private final BigDecimal prevPrice;
    private final String prevPriceList;
    private final BigDecimal prevMrr;
    private final String prevCurrency;
    private final DateTime prevStartDate;
    private final String prevState;

    private final String nextProductName;
    private final String nextProductType;
    private final String nextProductCategory;
    private final String nextSlug;
    private final String nextPhase;
    private final String nextBillingPeriod;
    private final BigDecimal nextPrice;
    private final String nextPriceList;
    private final BigDecimal nextMrr;
    private final String nextCurrency;
    private final DateTime nextStartDate;
    private final String nextState;

    @JsonCreator
    public BusinessSubscriptionTransitionJson(@JsonProperty("totalOrdering") final Long totalOrdering,
                                              @JsonProperty("bundleId") final String bundleId,
                                              @JsonProperty("externalKey") final String externalKey,
                                              @JsonProperty("accountId") final String accountId,
                                              @JsonProperty("accountKey") final String accountKey,
                                              @JsonProperty("subscriptionId") final String subscriptionId,
                                              @JsonProperty("requestedTimestamp") final DateTime requestedTimestamp,
                                              @JsonProperty("eventType") final String eventType,
                                              @JsonProperty("category") final String category,
                                              @JsonProperty("prevProductName") final String prevProductName,
                                              @JsonProperty("prevProductType") final String prevProductType,
                                              @JsonProperty("prevProductCategory") final String prevProductCategory,
                                              @JsonProperty("prevSlug") final String prevSlug,
                                              @JsonProperty("prevPhase") final String prevPhase,
                                              @JsonProperty("prevBillingPeriod") final String prevBillingPeriod,
                                              @JsonProperty("prevPrice") final BigDecimal prevPrice,
                                              @JsonProperty("prevPriceList") final String prevPriceList,
                                              @JsonProperty("prevMrr") final BigDecimal prevMrr,
                                              @JsonProperty("prevCurrency") final String prevCurrency,
                                              @JsonProperty("prevStartDate") final DateTime prevStartDate,
                                              @JsonProperty("prevState") final String prevState,
                                              @JsonProperty("nextProductName") final String nextProductName,
                                              @JsonProperty("nextProductType") final String nextProductType,
                                              @JsonProperty("nextProductCategory") final String nextProductCategory,
                                              @JsonProperty("nextSlug") final String nextSlug,
                                              @JsonProperty("nextPhase") final String nextPhase,
                                              @JsonProperty("nextBillingPeriod") final String nextBillingPeriod,
                                              @JsonProperty("nextPrice") final BigDecimal nextPrice,
                                              @JsonProperty("nextPriceList") final String nextPriceList,
                                              @JsonProperty("nextMrr") final BigDecimal nextMrr,
                                              @JsonProperty("nextCurrency") final String nextCurrency,
                                              @JsonProperty("nextStartDate") final DateTime nextStartDate,
                                              @JsonProperty("nextState") final String nextState) {
        this.totalOrdering = totalOrdering;
        this.bundleId = bundleId;
        this.externalKey = externalKey;
        this.accountId = accountId;
        this.accountKey = accountKey;
        this.subscriptionId = subscriptionId;
        this.requestedTimestamp = requestedTimestamp;
        this.eventType = eventType;
        this.category = category;
        this.prevProductName = prevProductName;
        this.prevProductType = prevProductType;
        this.prevProductCategory = prevProductCategory;
        this.prevSlug = prevSlug;
        this.prevPhase = prevPhase;
        this.prevBillingPeriod = prevBillingPeriod;
        this.prevPrice = prevPrice;
        this.prevPriceList = prevPriceList;
        this.prevMrr = prevMrr;
        this.prevCurrency = prevCurrency;
        this.prevStartDate = prevStartDate;
        this.prevState = prevState;
        this.nextProductName = nextProductName;
        this.nextProductType = nextProductType;
        this.nextProductCategory = nextProductCategory;
        this.nextSlug = nextSlug;
        this.nextPhase = nextPhase;
        this.nextBillingPeriod = nextBillingPeriod;
        this.nextPrice = nextPrice;
        this.nextPriceList = nextPriceList;
        this.nextMrr = nextMrr;
        this.nextCurrency = nextCurrency;
        this.nextStartDate = nextStartDate;
        this.nextState = nextState;
    }

    public BusinessSubscriptionTransitionJson(final BusinessSubscriptionTransition businessSubscriptionTransition) {
        this(businessSubscriptionTransition.getTotalOrdering(),
             businessSubscriptionTransition.getBundleId().toString(),
             businessSubscriptionTransition.getExternalKey(),
             businessSubscriptionTransition.getAccountId().toString(),
             businessSubscriptionTransition.getAccountKey(),
             businessSubscriptionTransition.getSubscriptionId().toString(),
             businessSubscriptionTransition.getRequestedTimestamp(),
             businessSubscriptionTransition.getEventType(),
             businessSubscriptionTransition.getCategory(),
             businessSubscriptionTransition.getPrevProductName(),
             businessSubscriptionTransition.getPrevProductType(),
             businessSubscriptionTransition.getPrevProductCategory(),
             businessSubscriptionTransition.getPrevSlug(),
             businessSubscriptionTransition.getPrevPhase(),
             businessSubscriptionTransition.getPrevBillingPeriod(),
             businessSubscriptionTransition.getPrevPrice(),
             businessSubscriptionTransition.getPrevPriceList(),
             businessSubscriptionTransition.getPrevMrr(),
             businessSubscriptionTransition.getPrevCurrency(),
             businessSubscriptionTransition.getPrevStartDate(),
             businessSubscriptionTransition.getPrevState(),
             businessSubscriptionTransition.getNextProductName(),
             businessSubscriptionTransition.getNextProductType(),
             businessSubscriptionTransition.getNextProductCategory(),
             businessSubscriptionTransition.getNextSlug(),
             businessSubscriptionTransition.getNextPhase(),
             businessSubscriptionTransition.getNextBillingPeriod(),
             businessSubscriptionTransition.getNextPrice(),
             businessSubscriptionTransition.getNextPriceList(),
             businessSubscriptionTransition.getNextMrr(),
             businessSubscriptionTransition.getNextCurrency(),
             businessSubscriptionTransition.getNextStartDate(),
             businessSubscriptionTransition.getNextState());
    }

    public Long getTotalOrdering() {
        return totalOrdering;
    }

    public String getBundleId() {
        return bundleId;
    }

    public String getExternalKey() {
        return externalKey;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountKey() {
        return accountKey;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public DateTime getRequestedTimestamp() {
        return requestedTimestamp;
    }

    public String getEventType() {
        return eventType;
    }

    public String getCategory() {
        return category;
    }

    public String getPrevProductName() {
        return prevProductName;
    }

    public String getPrevProductType() {
        return prevProductType;
    }

    public String getPrevProductCategory() {
        return prevProductCategory;
    }

    public String getPrevSlug() {
        return prevSlug;
    }

    public String getPrevPhase() {
        return prevPhase;
    }

    public String getPrevBillingPeriod() {
        return prevBillingPeriod;
    }

    public BigDecimal getPrevPrice() {
        return prevPrice;
    }

    public String getPrevPriceList() {
        return prevPriceList;
    }

    public BigDecimal getPrevMrr() {
        return prevMrr;
    }

    public String getPrevCurrency() {
        return prevCurrency;
    }

    public DateTime getPrevStartDate() {
        return prevStartDate;
    }

    public String getPrevState() {
        return prevState;
    }

    public String getNextProductName() {
        return nextProductName;
    }

    public String getNextProductType() {
        return nextProductType;
    }

    public String getNextProductCategory() {
        return nextProductCategory;
    }

    public String getNextSlug() {
        return nextSlug;
    }

    public String getNextPhase() {
        return nextPhase;
    }

    public String getNextBillingPeriod() {
        return nextBillingPeriod;
    }

    public BigDecimal getNextPrice() {
        return nextPrice;
    }

    public String getNextPriceList() {
        return nextPriceList;
    }

    public BigDecimal getNextMrr() {
        return nextMrr;
    }

    public String getNextCurrency() {
        return nextCurrency;
    }

    public DateTime getNextStartDate() {
        return nextStartDate;
    }

    public String getNextState() {
        return nextState;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessSubscriptionTransitionJson");
        sb.append("{totalOrdering=").append(totalOrdering);
        sb.append(", bundleId='").append(bundleId).append('\'');
        sb.append(", externalKey='").append(externalKey).append('\'');
        sb.append(", accountId='").append(accountId).append('\'');
        sb.append(", accountKey='").append(accountKey).append('\'');
        sb.append(", subscriptionId='").append(subscriptionId).append('\'');
        sb.append(", requestedTimestamp=").append(requestedTimestamp);
        sb.append(", eventType='").append(eventType).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", prevProductName='").append(prevProductName).append('\'');
        sb.append(", prevProductType='").append(prevProductType).append('\'');
        sb.append(", prevProductCategory='").append(prevProductCategory).append('\'');
        sb.append(", prevSlug='").append(prevSlug).append('\'');
        sb.append(", prevPhase='").append(prevPhase).append('\'');
        sb.append(", prevBillingPeriod='").append(prevBillingPeriod).append('\'');
        sb.append(", prevPrice=").append(prevPrice);
        sb.append(", prevPriceList='").append(prevPriceList).append('\'');
        sb.append(", prevMrr=").append(prevMrr);
        sb.append(", prevCurrency='").append(prevCurrency).append('\'');
        sb.append(", prevStartDate=").append(prevStartDate);
        sb.append(", prevState='").append(prevState).append('\'');
        sb.append(", nextProductName='").append(nextProductName).append('\'');
        sb.append(", nextProductType='").append(nextProductType).append('\'');
        sb.append(", nextProductCategory='").append(nextProductCategory).append('\'');
        sb.append(", nextSlug='").append(nextSlug).append('\'');
        sb.append(", nextPhase='").append(nextPhase).append('\'');
        sb.append(", nextBillingPeriod='").append(nextBillingPeriod).append('\'');
        sb.append(", nextPrice=").append(nextPrice);
        sb.append(", nextPriceList='").append(nextPriceList).append('\'');
        sb.append(", nextMrr=").append(nextMrr);
        sb.append(", nextCurrency='").append(nextCurrency).append('\'');
        sb.append(", nextStartDate=").append(nextStartDate);
        sb.append(", nextState='").append(nextState).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final BusinessSubscriptionTransitionJson that = (BusinessSubscriptionTransitionJson) o;

        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) {
            return false;
        }
        if (accountKey != null ? !accountKey.equals(that.accountKey) : that.accountKey != null) {
            return false;
        }
        if (bundleId != null ? !bundleId.equals(that.bundleId) : that.bundleId != null) {
            return false;
        }
        if (category != null ? !category.equals(that.category) : that.category != null) {
            return false;
        }
        if (eventType != null ? !eventType.equals(that.eventType) : that.eventType != null) {
            return false;
        }
        if (externalKey != null ? !externalKey.equals(that.externalKey) : that.externalKey != null) {
            return false;
        }
        if (nextBillingPeriod != null ? !nextBillingPeriod.equals(that.nextBillingPeriod) : that.nextBillingPeriod != null) {
            return false;
        }
        if (nextCurrency != null ? !nextCurrency.equals(that.nextCurrency) : that.nextCurrency != null) {
            return false;
        }
        if (nextMrr != null ? !nextMrr.equals(that.nextMrr) : that.nextMrr != null) {
            return false;
        }
        if (nextPhase != null ? !nextPhase.equals(that.nextPhase) : that.nextPhase != null) {
            return false;
        }
        if (nextPrice != null ? !nextPrice.equals(that.nextPrice) : that.nextPrice != null) {
            return false;
        }
        if (nextPriceList != null ? !nextPriceList.equals(that.nextPriceList) : that.nextPriceList != null) {
            return false;
        }
        if (nextProductCategory != null ? !nextProductCategory.equals(that.nextProductCategory) : that.nextProductCategory != null) {
            return false;
        }
        if (nextProductName != null ? !nextProductName.equals(that.nextProductName) : that.nextProductName != null) {
            return false;
        }
        if (nextProductType != null ? !nextProductType.equals(that.nextProductType) : that.nextProductType != null) {
            return false;
        }
        if (nextSlug != null ? !nextSlug.equals(that.nextSlug) : that.nextSlug != null) {
            return false;
        }
        if (nextStartDate != null ? !nextStartDate.equals(that.nextStartDate) : that.nextStartDate != null) {
            return false;
        }
        if (nextState != null ? !nextState.equals(that.nextState) : that.nextState != null) {
            return false;
        }
        if (prevBillingPeriod != null ? !prevBillingPeriod.equals(that.prevBillingPeriod) : that.prevBillingPeriod != null) {
            return false;
        }
        if (prevCurrency != null ? !prevCurrency.equals(that.prevCurrency) : that.prevCurrency != null) {
            return false;
        }
        if (prevMrr != null ? !prevMrr.equals(that.prevMrr) : that.prevMrr != null) {
            return false;
        }
        if (prevPhase != null ? !prevPhase.equals(that.prevPhase) : that.prevPhase != null) {
            return false;
        }
        if (prevPrice != null ? !prevPrice.equals(that.prevPrice) : that.prevPrice != null) {
            return false;
        }
        if (prevPriceList != null ? !prevPriceList.equals(that.prevPriceList) : that.prevPriceList != null) {
            return false;
        }
        if (prevProductCategory != null ? !prevProductCategory.equals(that.prevProductCategory) : that.prevProductCategory != null) {
            return false;
        }
        if (prevProductName != null ? !prevProductName.equals(that.prevProductName) : that.prevProductName != null) {
            return false;
        }
        if (prevProductType != null ? !prevProductType.equals(that.prevProductType) : that.prevProductType != null) {
            return false;
        }
        if (prevSlug != null ? !prevSlug.equals(that.prevSlug) : that.prevSlug != null) {
            return false;
        }
        if (prevStartDate != null ? !prevStartDate.equals(that.prevStartDate) : that.prevStartDate != null) {
            return false;
        }
        if (prevState != null ? !prevState.equals(that.prevState) : that.prevState != null) {
            return false;
        }
        if (requestedTimestamp != null ? !requestedTimestamp.equals(that.requestedTimestamp) : that.requestedTimestamp != null) {
            return false;
        }
        if (subscriptionId != null ? !subscriptionId.equals(that.subscriptionId) : that.subscriptionId != null) {
            return false;
        }
        if (totalOrdering != null ? !totalOrdering.equals(that.totalOrdering) : that.totalOrdering != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = totalOrdering != null ? totalOrdering.hashCode() : 0;
        result = 31 * result + (bundleId != null ? bundleId.hashCode() : 0);
        result = 31 * result + (externalKey != null ? externalKey.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (accountKey != null ? accountKey.hashCode() : 0);
        result = 31 * result + (subscriptionId != null ? subscriptionId.hashCode() : 0);
        result = 31 * result + (requestedTimestamp != null ? requestedTimestamp.hashCode() : 0);
        result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (prevProductName != null ? prevProductName.hashCode() : 0);
        result = 31 * result + (prevProductType != null ? prevProductType.hashCode() : 0);
        result = 31 * result + (prevProductCategory != null ? prevProductCategory.hashCode() : 0);
        result = 31 * result + (prevSlug != null ? prevSlug.hashCode() : 0);
        result = 31 * result + (prevPhase != null ? prevPhase.hashCode() : 0);
        result = 31 * result + (prevBillingPeriod != null ? prevBillingPeriod.hashCode() : 0);
        result = 31 * result + (prevPrice != null ? prevPrice.hashCode() : 0);
        result = 31 * result + (prevPriceList != null ? prevPriceList.hashCode() : 0);
        result = 31 * result + (prevMrr != null ? prevMrr.hashCode() : 0);
        result = 31 * result + (prevCurrency != null ? prevCurrency.hashCode() : 0);
        result = 31 * result + (prevStartDate != null ? prevStartDate.hashCode() : 0);
        result = 31 * result + (prevState != null ? prevState.hashCode() : 0);
        result = 31 * result + (nextProductName != null ? nextProductName.hashCode() : 0);
        result = 31 * result + (nextProductType != null ? nextProductType.hashCode() : 0);
        result = 31 * result + (nextProductCategory != null ? nextProductCategory.hashCode() : 0);
        result = 31 * result + (nextSlug != null ? nextSlug.hashCode() : 0);
        result = 31 * result + (nextPhase != null ? nextPhase.hashCode() : 0);
        result = 31 * result + (nextBillingPeriod != null ? nextBillingPeriod.hashCode() : 0);
        result = 31 * result + (nextPrice != null ? nextPrice.hashCode() : 0);
        result = 31 * result + (nextPriceList != null ? nextPriceList.hashCode() : 0);
        result = 31 * result + (nextMrr != null ? nextMrr.hashCode() : 0);
        result = 31 * result + (nextCurrency != null ? nextCurrency.hashCode() : 0);
        result = 31 * result + (nextStartDate != null ? nextStartDate.hashCode() : 0);
        result = 31 * result + (nextState != null ? nextState.hashCode() : 0);
        return result;
    }
}
