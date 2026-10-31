package androidx.car.app.model;

import java.util.Objects;
import p.jfd1;
import p.qrd;
import p.sxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final sxd1 mTemplate;

    public TabContents(jfd1 jfd1Var) {
        this.mTemplate = jfd1Var.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabContents) {
            return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
        }
        return false;
    }

    public String getContentId() {
        return CONTENT_ID;
    }

    public sxd1 getTemplate() {
        sxd1 sxd1Var = this.mTemplate;
        Objects.requireNonNull(sxd1Var);
        return sxd1Var;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    private TabContents() {
        this.mTemplate = null;
    }
}
