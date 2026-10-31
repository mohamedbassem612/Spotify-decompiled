package p;

import android.widget.FrameLayout;
import com.spotify.scrollsita.v1.Section;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qrw extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ esw b;
    public final /* synthetic */ wao0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qrw(esw eswVar, wao0 wao0Var, byte b) {
        super(0);
        this.a = b;
        this.b = eswVar;
        this.c = wao0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 1;
        nim0 nim0Var = nim0.a;
        iu30 iu30Var = this.c;
        esw eswVar = this.b;
        switch (b) {
            case 0:
                return eswVar.I.m0() ? fdg1.m0((tyq) new qrw(eswVar, iu30Var, b2).invoke(), null, null, 3) : (laa) new qrw(eswVar, iu30Var, (byte) 2).invoke();
            case 1:
                return eswVar.H.d(iu30Var);
            case 2:
                return eswVar.G.d(iu30Var);
            case 3:
                return q1o1.u(eswVar.w.a(xsr0.d, iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 4:
                return q1o1.u(eswVar.v.a(iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 5:
                return q1o1.u(eswVar.k.a(xsr0.d, iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 6:
                return q1o1.u(eswVar.j.a(iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 7:
                return q1o1.u(eswVar.A.a(xsr0.d, iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 8:
                return q1o1.u(eswVar.z.a(iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 9:
                return eswVar.K.a(iu30Var);
            case 10:
                return eswVar.L.a(iu30Var);
            case 11:
                return new mb51(q1o1.u(eswVar.l.a(iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4), i951.a, w39.a);
            case 12:
                return q1o1.u(eswVar.F.a(iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 13:
                return eswVar.W.a(xsr0.d, iu30Var);
            case 14:
                return eswVar.a(iu30Var);
            case 15:
                return eswVar.b(iu30Var);
            case 16:
                return q1o1.u(eswVar.O.a(eswVar.Q, new ysr0(3), iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 17:
                return q1o1.u(eswVar.N.a(iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 18:
                return q1o1.u(eswVar.O.a(eswVar.Q, new ysr0(1), iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 19:
                return eswVar.c(iu30Var);
            case 20:
                return q1o1.u(eswVar.y.a(xsr0.d, iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 21:
                return q1o1.u(eswVar.x.a(iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 22:
                return q1o1.u(eswVar.s.a(xsr0.d, iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 23:
                return q1o1.u(eswVar.q.a(iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 24:
                return eswVar.M.a(iu30Var);
            case 25:
                return q1o1.u(eswVar.e.a(iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 26:
                return eswVar.d(iu30Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return eswVar.e(iu30Var);
            case 28:
                return eswVar.r.a(iu30Var);
            default:
                return q1o1.u(eswVar.n.a(iu30Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
        }
    }
}
