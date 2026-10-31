package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yrw {
    public final List a;

    public yrw(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yrw) && this.a.equals(((yrw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
