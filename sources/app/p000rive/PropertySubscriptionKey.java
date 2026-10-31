package app.p000rive;

import app.p000rive.runtime.kotlin.core.ViewModel;
import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lapp/rive/PropertySubscriptionKey;", "", "propertyPath", "", "propertyType", "Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "(Ljava/lang/String;Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;)V", "getPropertyPath", "()Ljava/lang/String;", "getPropertyType", "()Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final /* data */ class PropertySubscriptionKey {
    private final String propertyPath;
    private final ViewModel.PropertyDataType propertyType;

    public PropertySubscriptionKey(String str, ViewModel.PropertyDataType propertyDataType) {
        this.propertyPath = str;
        this.propertyType = propertyDataType;
    }

    public static /* synthetic */ PropertySubscriptionKey copy$default(PropertySubscriptionKey propertySubscriptionKey, String str, ViewModel.PropertyDataType propertyDataType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = propertySubscriptionKey.propertyPath;
        }
        if ((i & 2) != 0) {
            propertyDataType = propertySubscriptionKey.propertyType;
        }
        return propertySubscriptionKey.copy(str, propertyDataType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPropertyPath() {
        return this.propertyPath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ViewModel.PropertyDataType getPropertyType() {
        return this.propertyType;
    }

    public final PropertySubscriptionKey copy(String propertyPath, ViewModel.PropertyDataType propertyType) {
        return new PropertySubscriptionKey(propertyPath, propertyType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PropertySubscriptionKey)) {
            return false;
        }
        PropertySubscriptionKey propertySubscriptionKey = (PropertySubscriptionKey) other;
        return u890.j(this.propertyPath, propertySubscriptionKey.propertyPath) && this.propertyType == propertySubscriptionKey.propertyType;
    }

    public final String getPropertyPath() {
        return this.propertyPath;
    }

    public final ViewModel.PropertyDataType getPropertyType() {
        return this.propertyType;
    }

    public int hashCode() {
        return this.propertyType.hashCode() + (this.propertyPath.hashCode() * 31);
    }

    public String toString() {
        return "PropertySubscriptionKey(propertyPath=" + this.propertyPath + ", propertyType=" + this.propertyType + ")";
    }
}
