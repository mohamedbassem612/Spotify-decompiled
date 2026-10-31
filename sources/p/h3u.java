package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/h3u;", "Lp/zf30;", "<init>", "()V", "p/g3u", "src_main_java_com_spotify_tome_dialog-dialog"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class h3u extends zf30 {
    public ArrayList F1 = new ArrayList();
    public ArrayList G1 = new ArrayList();
    public g3u H1;
    public boolean I1;

    public final void D0() {
        ((zf30) this).h1 = true;
        this.I1 = false;
    }

    public final void E0() {
        this.I1 = true;
        if (this.H1 == null) {
            Y0();
        }
        ((zf30) this).h1 = true;
    }

    public final void F0(Bundle bundle) {
        bundle.putParcelableArrayList("request_code_map", this.F1);
        bundle.putParcelableArrayList("dialog_queue", this.G1);
        bundle.putParcelable("current_dialog", this.H1);
    }

    public final synchronized void Y0() {
        try {
            if (this.I1) {
                if (this.G1.isEmpty()) {
                    return;
                }
                if (this.H1 != null) {
                    return;
                }
                g3u g3uVar = (g3u) this.G1.remove(0);
                this.H1 = g3uVar;
                zf30 zf30VarG = j0().G(g3uVar != null ? g3uVar.a : null);
                s5w0 s5w0Var = zf30VarG instanceof s5w0 ? (s5w0) zf30VarG : null;
                if (s5w0Var != null) {
                    s5w0Var.toString();
                    s5w0Var.Y0();
                } else {
                    g3u g3uVar2 = this.H1;
                    throw new AssertionError("Cannot find fragment with tag " + (g3uVar2 != null ? g3uVar2.a : null));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void Z0(s5w0 s5w0Var) {
        Objects.toString(s5w0Var);
        this.G1.add(new g3u(((zf30) s5w0Var).a1));
        Y0();
    }

    public final synchronized void u0(int i, int i2, Intent intent) {
        g3u g3uVar = (g3u) this.F1.get(i - 1);
        zf30 zf30VarG = j0().G(g3uVar.a);
        s5w0 s5w0Var = zf30VarG instanceof s5w0 ? (s5w0) zf30VarG : null;
        Objects.toString(s5w0Var);
        if (s5w0Var == null) {
            return;
        }
        n57.b(g3uVar, this.H1);
        this.H1 = null;
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle != null) {
            synchronized (this) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("request_code_map");
                if (parcelableArrayList == null) {
                    return;
                }
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("dialog_queue");
                if (parcelableArrayList2 == null) {
                    return;
                }
                this.F1 = parcelableArrayList;
                this.G1 = parcelableArrayList2;
                this.H1 = (g3u) bundle.getParcelable("current_dialog");
            }
        }
    }
}
