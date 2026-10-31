package app.p000rive.core;

import kotlin.Metadata;
import p.cy30;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lapp/rive/core/DefaultViewModelInfo;", "", "viewModelName", "", "instanceName", "(Ljava/lang/String;Ljava/lang/String;)V", "getInstanceName", "()Ljava/lang/String;", "getViewModelName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DefaultViewModelInfo {
    public static final int $stable = 0;
    private final String instanceName;
    private final String viewModelName;

    public DefaultViewModelInfo(String str, String str2) {
        this.viewModelName = str;
        this.instanceName = str2;
    }

    public static /* synthetic */ DefaultViewModelInfo copy$default(DefaultViewModelInfo defaultViewModelInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultViewModelInfo.viewModelName;
        }
        if ((i & 2) != 0) {
            str2 = defaultViewModelInfo.instanceName;
        }
        return defaultViewModelInfo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getViewModelName() {
        return this.viewModelName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInstanceName() {
        return this.instanceName;
    }

    public final DefaultViewModelInfo copy(String viewModelName, String instanceName) {
        return new DefaultViewModelInfo(viewModelName, instanceName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultViewModelInfo)) {
            return false;
        }
        DefaultViewModelInfo defaultViewModelInfo = (DefaultViewModelInfo) other;
        return u890.j(this.viewModelName, defaultViewModelInfo.viewModelName) && u890.j(this.instanceName, defaultViewModelInfo.instanceName);
    }

    public final String getInstanceName() {
        return this.instanceName;
    }

    public final String getViewModelName() {
        return this.viewModelName;
    }

    public int hashCode() {
        return this.instanceName.hashCode() + (this.viewModelName.hashCode() * 31);
    }

    public String toString() {
        return cy30.p("DefaultViewModelInfo(viewModelName=", this.viewModelName, ", instanceName=", this.instanceName, ")");
    }
}
