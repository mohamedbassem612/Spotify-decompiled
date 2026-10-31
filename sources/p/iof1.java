package p;

import com.spotify.player.model.ContextTrack;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iof1 {
    public final ContextTrack a;
    public final uof1 b;
    public final boolean c;

    public iof1(ContextTrack contextTrack, uof1 uof1Var, boolean z) {
        this.a = contextTrack;
        this.b = uof1Var;
        this.c = z;
    }

    public final mtl a() {
        mtl mtlVar = this.b.c;
        return mtlVar == null ? new mtl() : mtlVar;
    }

    public final jo70 b() {
        jo70 jo70Var = this.b.b;
        return jo70Var == null ? new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31) : jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iof1)) {
            return false;
        }
        iof1 iof1Var = (iof1) obj;
        return u890.j(this.a, iof1Var.a) && u890.j(this.b, iof1Var.b) && this.c == iof1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
