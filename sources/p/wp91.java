package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wp91 implements xp91 {
    public final List a;

    public wp91(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp91) && this.a.equals(((wp91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
