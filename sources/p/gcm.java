package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gcm {
    public final String a;
    public final String b;
    public final ucm c;
    public final Function0 d;

    public gcm(String str, String str2, ucm ucmVar, Function0 function0, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        ucmVar = (i & 4) != 0 ? rcm.a : ucmVar;
        function0 = (i & 16) != 0 ? aok.b1 : function0;
        this.a = str;
        this.b = str2;
        this.c = ucmVar;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcm)) {
            return false;
        }
        gcm gcmVar = (gcm) obj;
        return u890.j(this.a, gcmVar.a) && u890.j(this.b, gcmVar.b) && this.c.equals(gcmVar.c) && u890.j(this.d.invoke(), gcmVar.d.invoke());
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((tgm) this.d.invoke()).hashCode() + ((this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }
}
