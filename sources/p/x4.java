package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x4 implements xpw {
    public final uu00 a;
    public final wh71 b;
    public final oud c;
    public final e7m0 d;
    public final eih1 e;
    public final psw f;

    public x4(uu00 uu00Var, wh71 wh71Var, oud oudVar) {
        this.a = uu00Var;
        this.b = wh71Var;
        this.c = oudVar;
        h3 h3Var = h3.P0;
        n4 n4Var = n4.b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        w4 w4Var = new w4(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f4.class), runSequentially.a(w4Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g4.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u4(this)));
        fns fnsVar = igu.a;
        this.d = sbl.A(h3Var, n4Var, new a(b3s.c, coroutinesSubtypeEffectHandlerBuilderI), e3.d, new j2(this, (byte) 2));
        this.e = new eih1();
        j2i j2iVar = p2i.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) {
        r4 r4Var;
        mq70 mq70Var;
        pp70 pp70Var;
        String str2;
        List list;
        mq70 mq70Var2;
        up70 up70VarA;
        String str3;
        pp70 pp70Var2;
        if (onmVar instanceof r4) {
            r4Var = (r4) onmVar;
            int i = r4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r4Var.d = i - Integer.MIN_VALUE;
            } else {
                r4Var = new r4(this, onmVar);
            }
        } else {
            r4Var = new r4(this, onmVar);
        }
        Object objJ = r4Var.b;
        int i2 = r4Var.d;
        afx afxVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                ezc ezcVarG = yoi1.g(this.a.b(new oi("about-the-song-share-card", false, new v1(str, (byte) 1))));
                s4 s4Var = new s4(2, afxVar, (byte) 0);
                r4Var.a = str;
                r4Var.d = 1;
                objJ = b5p1.j(ezcVarG, s4Var, r4Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = r4Var.a;
                hm5.M(objJ);
            }
            uv00 uv00Var = (uv00) objJ;
            xkk1 xkk1Var = uv00Var.a(xkk1.class, str).b;
            jo70 jo70Var = uv00Var.a(jo70.class, str).b;
            if (xkk1Var != null && (pp70Var2 = xkk1Var.d) != null) {
                afxVar = pp70Var2.c;
            } else if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (pp70Var = mq70Var.b) != null) {
                afxVar = pp70Var.c;
            }
            String strY0 = "";
            String str4 = (xkk1Var == null || (mq70Var2 = xkk1Var.a) == null || (up70VarA = mq70Var2.a(vp70.c)) == null || (str3 = up70VarA.a.a) == null) ? "" : str3;
            if (jo70Var == null || (str2 = jo70Var.a) == null) {
                str2 = "";
            }
            if (jo70Var != null && (list = jo70Var.d) != null) {
                strY0 = o7h.y0(list, ", ", (String) null, (String) null, h3.Q0, 30);
            }
            return new j4(afxVar != null ? z4p1.G(afxVar.a.c) : -16777216, afxVar != null ? z4p1.G(afxVar.a.b.a()) : -16777216, str2, strY0, str4);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new j4(-16777216, -16777216, "", "", "");
        }
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
