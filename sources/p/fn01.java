package p;

import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class fn01 {
    public static final en01 Companion = new en01();
    public static final znb0[] c = {null, dm5.S(2, ijz0.O0)};
    public final String a;
    public final EntityType b;

    public /* synthetic */ fn01(int i, String str, EntityType entityType) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, dn01.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = entityType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn01)) {
            return false;
        }
        fn01 fn01Var = (fn01) obj;
        return u890.j(this.a, fn01Var.a) && this.b == fn01Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public fn01(String str, EntityType entityType) {
        this.a = str;
        this.b = entityType;
    }
}
