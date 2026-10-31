package p;

import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sky {
    public final String a;
    public final EntityType b;
    public final int c;
    public final int d;
    public final String e;
    public final Function0 f;

    public sky(String str, EntityType entityType, int i, int i2, String str2, Function0 function0) {
        this.a = str;
        this.b = entityType;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sky)) {
            return false;
        }
        sky skyVar = (sky) obj;
        return u890.j(this.a, skyVar.a) && this.b == skyVar.b && this.c == skyVar.c && this.d == skyVar.d && u890.j(this.e, skyVar.e) && u890.j(this.f, skyVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(ab80.k(this.d, kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e);
    }
}
