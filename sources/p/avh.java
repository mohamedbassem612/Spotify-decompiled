package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class avh {
    public static final void a(WidgetState.ActiveSession activeSession, gt40 gt40Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(495727842);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(activeSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(gt40Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            kiv kivVar = p4k.a;
            float fB = s3v.b(((s3v) b0kVar3.k(kivVar)).a);
            float fA = s3v.a(((s3v) b0kVar3.k(kivVar)).a);
            CurrentTrackMetadata metadata = activeSession.getMetadata();
            boolean z = p3v.b(fB, 180.0f) >= 0;
            whb1 whb1VarC = ivh.c((String) b0kVar3.k(wol1.b), (String) b0kVar3.k(wol1.c), (String) b0kVar3.k(wol1.a), metadata.getUri());
            float fMin = Math.min(56.0f, fA - 24.0f);
            float f = zjy.p(0.0f, new p3v(Math.min(12.0f - ((48.0f - fMin) / 2.0f), 12.0f))).a;
            float f2 = zjy.p(0.0f, new p3v(0.0f)).a;
            float f3 = 144.0f;
            float fMin2 = Math.min(zjy.p(0.0f, new p3v(fB - ((((12.0f + fMin) + 24.0f) + 80.0f) + 48.0f))).a, 144.0f);
            if (p3v.b(fMin2, 144.0f) < 0) {
                f3 = 96.0f;
                if (p3v.b(fMin2, 96.0f) < 0) {
                    f3 = p3v.b(fMin2, 48.0f) >= 0 ? 48.0f : 0.0f;
                }
            }
            gt40 gt40VarH = eqr0.H(dm5.I(gt40Var), f, 0.0f, f2, 0.0f, 10);
            j2i j2iVarR = apo.r(-1429272250, new yuh(fMin, whb1VarC, z, metadata, f3, activeSession), b0kVar3);
            b0kVar2 = b0kVar3;
            jch0.f(gt40VarH, 1, j2iVarR, b0kVar2, 3072, 2);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zuh(activeSession, gt40Var, i);
        }
    }
}
