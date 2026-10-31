package androidx.car.app.model;

import java.util.Objects;
import p.qrd;
import p.sxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@qrd
public final class TemplateInfo {
    private final Class<? extends sxd1> mTemplateClass;
    private final String mTemplateId;

    private TemplateInfo() {
        this.mTemplateClass = null;
        this.mTemplateId = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateInfo)) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) obj;
        return Objects.equals(this.mTemplateClass, templateInfo.mTemplateClass) && Objects.equals(this.mTemplateId, templateInfo.mTemplateId);
    }

    public Class<? extends sxd1> getTemplateClass() {
        Class<? extends sxd1> cls = this.mTemplateClass;
        Objects.requireNonNull(cls);
        return cls;
    }

    public String getTemplateId() {
        String str = this.mTemplateId;
        Objects.requireNonNull(str);
        return str;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplateClass, this.mTemplateId);
    }

    public TemplateInfo(Class<? extends sxd1> cls, String str) {
        this.mTemplateClass = cls;
        this.mTemplateId = str;
    }
}
