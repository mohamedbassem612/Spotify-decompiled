package p;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.puffin.core.domain.usecases.GetFawFilterException;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lmw implements Function, i2q0, Producer, yu30, lzy, is31, MaybeOnSubscribe, oah, jrn0, ix30 {
    public final /* synthetic */ byte a;
    public final Object b;

    public lmw(ynb0 ynb0Var) {
        this.a = (byte) 26;
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(ynb0Var);
        this.b = k4p1.k(smc0VarN);
    }

    public static lmw g(tg30 tg30Var) {
        return new lmw((Object) tg30Var, (byte) 16);
    }

    public static String z(gd70 gd70Var) {
        Object objJ;
        sc70 sc70Var = (sc70) gd70Var.a.k.get("click");
        String string = (sc70Var == null || (objJ = sc70Var.a.j("uri")) == null) ? null : objJ.toString();
        return string == null ? "" : string;
    }

    public mr20 a() {
        bn70 bn70VarA = ((cbr0) this.b).b0(bn70.class).a();
        return bn70VarA != null ? new huz(bn70VarA.b.a, (byte) 10) : r6x.a;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                String str = (String) obj;
                hj91 hj91Var = ((dax) obj2).b;
                str.getClass();
                return hj91Var.d(str);
            case 4:
                return ((zeu) obj2).u(((GetEntityResponse) obj).n().t().n().n());
            case 7:
                return ((ruz) obj2).f(SkipToNextTrackCommand.create());
            case 9:
                bs10 bs10Var = ((hs00) obj2).c;
                return Single.fromCallable(new e71(bs10Var.b, bs10.a((String) obj), (byte) 6)).map(mif1.d1).onErrorResumeNext(as10.b).subscribeOn(bs10Var.a).onErrorComplete();
            case 11:
                mmr0 mmr0Var = (mmr0) obj;
                z310 z310Var = (z310) mmr0Var.a;
                if (!((Boolean) mmr0Var.b).booleanValue()) {
                    return Observable.just(z310Var);
                }
                Observable observableJust = Observable.just(z310Var);
                nkv nkvVar = ((c610) obj2).j;
                nkvVar.getClass();
                return observableJust.compose(new bk1(nkvVar, (byte) 15));
            case 12:
                Integer num = (Integer) obj;
                return new ub10(num.intValue(), s3o1.v((ContextTrack) obj2, false) ? -16777216 : num.intValue());
            case 14:
                return new w300(((vaw) obj2).h, (List) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                l3c1 l3c1Var = (l3c1) obj2;
                n57.e("[Puffin] Error getting raw filter " + l3c1Var + ": " + ((Throwable) obj));
                return Single.error(new GetFawFilterException(l3c1Var));
            default:
                a450 a450Var = (a450) obj2;
                return a450Var.b.b(a450Var.f, (String) obj);
        }
    }

    public void b(fx60 fx60Var, z5o0 z5o0Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-693129046);
        int i2 = i | (x340Var2.i(fx60Var) ? 4 : 2) | (x340Var2.i(z5o0Var) ? 32 : 16) | 384 | (x340Var2.i(this) ? 16384 : 8192);
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = u291.B(qim0Var3, (gra) null, 3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarX = u291.x(0.0f, 640.0f, 1, too1.y(qim0Var3, lhc.g(x340Var2).f));
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            cua cuaVar2 = cbx.b(x340Var2).f;
            cgj1.n(i1p1.q(qim0VarX, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12)), apo.r(1099420704, new bp50(this, z5o0Var, fx60Var, (byte) 15), x340Var2), (vu30) null, (vu30) null, (vu30) null, 0, 0L, 0L, lhc.g(x340Var2).g, apo.r(-895097227, new rv71(j2iVar, (byte) 15), x340Var2), x340Var2, 805306416, 252);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 9, i, this, fx60Var, z5o0Var, qim0Var2, j2iVar);
        }
    }

    public void c(int i) {
        w0y w0yVar = ((te50) this.b).d;
        if (w0yVar != null) {
            w0yVar.a(i);
        }
    }

    public void d(h0r0 h0r0Var, j2i j2iVar, b0k b0kVar, int i) {
        rih1 rih1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-91936375);
        int i2 = (x340Var.i(h0r0Var) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else {
            if (h0r0Var == null) {
                x340Var.i0(1312725299);
                j2iVar.invoke(new tx60(7, null, null), x340Var, 48);
                x340Var.r(false);
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new jx60(this, h0r0Var, j2iVar, i, (byte) 0);
                    return;
                }
                return;
            }
            x340Var.i0(1312761817);
            x340Var.r(false);
            tx60 tx60Var = (tx60) rwq.g(qqn1.f(h0r0Var.a().b0(tx60.class)), (Object) null, (o8n) null, x340Var, 48, 2).getValue();
            if (tx60Var == null) {
                x340Var.i0(1312945987);
                x340Var.r(false);
                rih1Var = null;
            } else {
                x340Var.i0(1312945988);
                j2iVar.invoke(tx60Var, x340Var, 48);
                x340Var.r(false);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                x340Var.i0(1843469224);
                j2iVar.invoke(new tx60(7, null, null), x340Var, 48);
            } else {
                x340Var.i0(1843467891);
            }
            x340Var.r(false);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new jx60(this, h0r0Var, j2iVar, i, (byte) 1);
        }
    }

    public void e() {
        tg30 tg30Var = (tg30) this.b;
        tg30Var.g.b(tg30Var, tg30Var, (zf30) null);
    }

    public Intent f(Intent intent) {
        Object next;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        int i = FandomCollectiblesStoryActivity.g1;
        Context context = ((igo) this.b).b;
        String strJ = s4b1VarX.j();
        if (strJ == null) {
            strJ = "";
        }
        String strZ = s4b1VarX.z();
        String str = strZ != null ? strZ : "";
        String strN = s4b1VarX.n("mode");
        Iterator it = a9c1.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!nhc1.S(((a9c1) next).name(), strN, true));
        a9c1 a9c1Var = (a9c1) next;
        if (a9c1Var == null) {
            a9c1Var = a9c1.a;
        }
        Intent intent2 = new Intent(context, (Class<?>) FandomCollectiblesStoryActivity.class);
        intent2.setFlags(268435456);
        intent2.putExtra("fandom_collectibles.story.id", strJ);
        intent2.putExtra("fandom_collectibles.story.uri", str);
        intent2.putExtra("fandom_collectibles.story.mode", (Serializable) a9c1Var);
        return intent2;
    }

    public Object get() {
        return new DispatcherWorker(((cny) this.b).d);
    }

    public void h() {
        ai30 ai30Var = ((tg30) this.b).g;
        ((th30) ai30Var).J = false;
        ((th30) ai30Var).K = false;
        ((th30) ai30Var).Q.g = false;
        ai30Var.v(4);
    }

    public boolean i() {
        return ((tg30) this.b).g.k();
    }

    public void j() {
        ai30 ai30Var = ((tg30) this.b).g;
        ((th30) ai30Var).J = false;
        ((th30) ai30Var).K = false;
        ((th30) ai30Var).Q.g = false;
        ai30Var.v(1);
    }

    public void k() {
        ((tg30) this.b).g.m();
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        ((fn60) ((wf2) this.b).b).b = s4b1VarX.h();
        return crn0.a;
    }

    public void m() {
        ((tg30) this.b).g.o(true);
    }

    public void n() {
        ai30 ai30Var = ((tg30) this.b).g;
        if (((th30) ai30Var).h != null) {
            ai30Var.d();
        }
        ai30Var.v(5);
    }

    public void o() {
        ai30 ai30Var = ((tg30) this.b).g;
        ((th30) ai30Var).J = false;
        ((th30) ai30Var).K = false;
        ((th30) ai30Var).Q.g = false;
        ai30Var.v(7);
    }

    public void onComplete(Task task) {
        Exception excV;
        l441 l441Var = (l441) this.b;
        boolean zJ = task.j();
        rih1 rih1Var = rih1.a;
        if (zJ) {
            l441Var.resumeWith(rih1Var);
            return;
        }
        Exception excF = task.f();
        if (excF == null || (excV = lmt0.v(excF)) == null) {
            l441Var.resumeWith(rih1Var);
        } else {
            l441Var.resumeWith(new m231(excV));
        }
    }

    public void onFailure(Throwable th) throws Exception {
        ((zx70) this.b).close();
    }

    public void onSuccess(Object obj) {
    }

    public void p() {
        ai30 ai30Var = ((tg30) this.b).g;
        ((th30) ai30Var).J = false;
        ((th30) ai30Var).K = false;
        ((th30) ai30Var).Q.g = false;
        ai30Var.v(5);
    }

    public void q() {
        ai30 ai30Var = ((tg30) this.b).g;
        ((th30) ai30Var).K = true;
        ((th30) ai30Var).Q.g = true;
        ai30Var.v(4);
    }

    public void r() {
        ((tg30) this.b).g.A(true);
    }

    public i1k0 s() {
        Set set = s4b1.f;
        String stringExtra = ((dir0) this.b).getIntent().getStringExtra("com.spotify.endless.sessionstarter.KEY_EXTRA_DEEPLINK");
        if (stringExtra == null) {
            stringExtra = "";
        }
        s4b1 s4b1VarX = uic.x(stringExtra);
        int iOrdinal = s4b1VarX.c.ordinal();
        if (iOrdinal == 477) {
            String strO = s4b1VarX.o(1);
            if (strO == null) {
                strO = "your-dj";
            }
            return new rzx(strO);
        }
        if (iOrdinal != 478) {
            hhg1.n("pageUri not supported by EndlessContext");
            return null;
        }
        String strO2 = s4b1VarX.o(1);
        if (strO2 == null) {
            strO2 = "todays-feed";
        }
        return new qzx(strO2);
    }

    public void subscribe(MaybeEmitter maybeEmitter) {
        if (maybeEmitter.isDisposed()) {
            return;
        }
        n8d0 n8d0Var = (n8d0) this.b;
        n8d0Var.b(new nx30(n8d0Var, new fey(maybeEmitter, (byte) 14), (byte) 24), l5u.a);
    }

    public ai30 t() {
        return ((tg30) this.b).g;
    }

    public void u() {
        ((tg30) this.b).g.W();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return ((th30) ((tg30) this.b).g).f.onCreateView(view, str, context, attributeSet);
    }

    public void w(String str, byte[] bArr) {
        ((nb00) this.b).c(str, bArr);
    }

    public beg x(mb11 mb11Var) {
        nqb0 nqb0Var;
        kf30 kf30VarD = mb11Var.d();
        Class<?> declaringClass = mb11Var.a.getDeclaringClass();
        mb11 mb11Var2 = declaringClass != null ? new mb11(declaringClass) : null;
        if (mb11Var2 != null) {
            beg begVarX = x(mb11Var2);
            zpi0 zpi0VarO = begVarX != null ? begVarX.O() : null;
            jfg jfgVarG = zpi0VarO != null ? zpi0VarO.g(mb11Var.f(), 19) : null;
            if (jfgVarG instanceof beg) {
                return (beg) jfgVarG;
            }
        } else if (kf30VarD != null && (nqb0Var = (nqb0) o7h.s0(((oqb0) this.b).c(kf30VarD.b()))) != null) {
            tqb0 tqb0Var = nqb0Var.X.d;
            tqb0Var.getClass();
            return tqb0Var.u(mb11Var.f(), mb11Var);
        }
        return null;
    }

    public void y(Parcelable parcelable) {
        ai30 ai30Var = ((tg30) this.b).g;
        if (((th30) ai30Var).x instanceof qe41) {
            ai30Var.o0(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
            throw null;
        }
        ai30Var.d0(parcelable);
    }

    public /* synthetic */ lmw(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public lmw(ContextTrack contextTrack, ac10 ac10Var) {
        this.a = (byte) 12;
        this.b = contextTrack;
    }

    public lmw(kqi0 kqi0Var) {
        this.a = (byte) 0;
        this.b = new so(kqi0Var, this, (byte) 13);
    }
}
