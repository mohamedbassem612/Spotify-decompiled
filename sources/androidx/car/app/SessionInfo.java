package androidx.car.app;

import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Objects;
import java.util.Set;
import p.b291;
import p.kg11;
import p.qrd;
import p.sxd1;
import p.t380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class SessionInfo {
    private static final t380 CLUSTER_SUPPORTED_TEMPLATES_API_6;
    private static final t380 CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
    public static final SessionInfo DEFAULT_SESSION_INFO;
    public static final int DISPLAY_TYPE_CLUSTER = 1;
    public static final int DISPLAY_TYPE_MAIN = 0;
    private static final char DIVIDER = '/';
    private final int mDisplayType;
    private final String mSessionId;

    static {
        int i = t380.c;
        CLUSTER_SUPPORTED_TEMPLATES_API_6 = new b291(NavigationTemplate.class);
        CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6 = kg11.t;
        DEFAULT_SESSION_INFO = new SessionInfo(0, "main");
    }

    private SessionInfo() {
        this.mSessionId = "main";
        this.mDisplayType = 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SessionInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return getSessionId().equals(sessionInfo.getSessionId()) && getDisplayType() == sessionInfo.getDisplayType();
    }

    public int getDisplayType() {
        return this.mDisplayType;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public Set<Class<? extends sxd1>> getSupportedTemplates(int i) {
        if (this.mDisplayType == 1) {
            return i >= 6 ? CLUSTER_SUPPORTED_TEMPLATES_API_6 : CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.mSessionId, Integer.valueOf(this.mDisplayType));
    }

    public String toString() {
        return String.valueOf(this.mDisplayType) + DIVIDER + this.mSessionId;
    }

    public SessionInfo(int i, String str) {
        this.mDisplayType = i;
        this.mSessionId = str;
    }
}
