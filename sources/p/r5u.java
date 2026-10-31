package p;

import com.spotify.playback_esperanto.proto.PlaybackEsperanto;
import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r5u implements wt7 {
    public final /* synthetic */ byte a;
    public final be b;
    public final Object c;

    public /* synthetic */ r5u(be beVar, Object obj, byte b) {
        this.a = b;
        this.b = beVar;
        this.c = obj;
    }

    public final void a() {
        byte b = this.a;
        vt7 vt7Var = vt7.a;
        switch (b) {
            case 0:
                b(vt7Var, 200, 0.25f);
                break;
            default:
                b(vt7Var, 200, 0.25f);
                break;
        }
    }

    public final void b(vt7 vt7Var, int i, float f) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                czt0 czt0VarN = PlaybackEsperanto.DuckRequest.n();
                czt0VarN.n(bzt0.b);
                czt0VarN.q(i);
                czt0VarN.r(f);
                fn31.T((c9n) obj, (o8n) null, 0, new n5s(this, czt0VarN.build(), (lnm) null, (byte) 25), 3);
                break;
            default:
                if (((bbc) ((tfp0) obj).d).l(new kev(vt7Var, Float.valueOf(f), i, this.b)) instanceof pge) {
                    eg.m("Check failed.");
                    break;
                }
                break;
        }
    }

    public final void c(vt7 vt7Var, int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                czt0 czt0VarN = PlaybackEsperanto.DuckRequest.n();
                czt0VarN.n(bzt0.c);
                czt0VarN.q(i);
                fn31.T((c9n) obj, (o8n) null, 0, new n5s(this, czt0VarN.build(), (lnm) null, (byte) 25), 3);
                break;
            default:
                if (((bbc) ((tfp0) obj).d).l(new kev(vt7Var, null, i, this.b)) instanceof pge) {
                    eg.m("Check failed.");
                    break;
                }
                break;
        }
    }

    public final void d(vt7 vt7Var) {
        switch (this.a) {
            case 0:
                c(vt7Var, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER);
                break;
            default:
                c(vt7Var, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER);
                break;
        }
    }
}
