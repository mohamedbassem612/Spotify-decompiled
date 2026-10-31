package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661(with = bqa0.class)
public final class aqa0 {
    public static final zpa0 Companion = new zpa0();
    public final Map a;

    public aqa0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqa0) && u890.j(this.a, ((aqa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
