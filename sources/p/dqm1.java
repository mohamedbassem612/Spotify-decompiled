package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.autodownload.esperanto.proto.EnabledShowsCountRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dqm1 implements ayl {
    public final ayl a;
    public final sdz b;
    public final cfr c;
    public final iyc0 d;
    public final xrm1 e;
    public final vlo f;
    public final uu00 g;
    public final kt8 h;
    public final ix7 i;
    public final q8n j;
    public final vku k;

    public dqm1(ayl aylVar, sdz sdzVar, cfr cfrVar, iyc0 iyc0Var, xrm1 xrm1Var, vlo vloVar, uu00 uu00Var, kt8 kt8Var, ix7 ix7Var, q8n q8nVar, vku vkuVar) {
        this.a = aylVar;
        this.b = sdzVar;
        this.c = cfrVar;
        this.d = iyc0Var;
        this.e = xrm1Var;
        this.f = vloVar;
        this.g = uu00Var;
        this.h = kt8Var;
        this.i = ix7Var;
        this.j = q8nVar;
        this.k = vkuVar;
    }

    @Override // p.ayl
    public final void a(String str, String str2) {
        this.a.a(str, str2);
    }

    @Override // p.ayl
    public final void d(String str, String str2) {
        Single singleJust;
        EnumSet enumSet = sdz.e;
        Set set = s4b1.f;
        if (!enumSet.contains(uic.x(str).c)) {
            this.a.d(str, str2);
            return;
        }
        kt8 kt8Var = this.h;
        kt8Var.getClass();
        if (kt8.h.contains(uic.x(str).c) && uic.x(str2).c == blc0.fh) {
            Single single = (Single) kt8Var.c.getValue();
            Single single2 = (Single) kt8Var.d.getValue();
            Single singleC = kt8Var.b.c(k4p1.x(str2), kt8.g);
            Observable map = kt8Var.a.a((EnabledShowsCountRequest) EnabledShowsCountRequest.o().build()).map(pzs0.X);
            Boolean bool = Boolean.FALSE;
            singleJust = Single.zip(single, single2, singleC, map.first(bool), new it8(str2, kt8Var, (byte) 0)).onErrorReturnItem(bool);
            singleJust.getClass();
        } else {
            singleJust = Single.just(Boolean.FALSE);
            singleJust.getClass();
        }
        sdz sdzVar = this.b;
        Single map2 = g7h.b(sdzVar.a, str, new String[]{str}).map(new hdn1((byte) 3, sdzVar, str));
        if (sdzVar.c) {
            map2 = map2.flatMap(new w2z((byte) 3, sdzVar, str));
        }
        this.k.a(Single.zip(singleJust, map2.flatMap(new zrj1(this, str, str2, (byte) 18)), r3x0.Z0).flatMap(new ghk1(this, (byte) 4)).subscribe(new aqm1(this, str, str2, (byte) 0), new aqm1(this, str, str2, (byte) 1)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) throws Throwable {
        bqm1 bqm1Var;
        uio m231Var;
        if (onmVar instanceof bqm1) {
            bqm1Var = (bqm1) onmVar;
            int i = bqm1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bqm1Var.d = i - Integer.MIN_VALUE;
            } else {
                bqm1Var = new bqm1(this, onmVar);
            }
        } else {
            bqm1Var = new bqm1(this, onmVar);
        }
        Object objJ = bqm1Var.b;
        int i2 = bqm1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleFirstOrError = ((zu00) this.g).b(new oi("content_marked_for_download", new bek1(str, (byte) 19))).filter(u3x0.Z0).firstOrError();
                bqm1Var.a = str;
                bqm1Var.d = 1;
                objJ = fc11.j(singleFirstOrError, bqm1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = bqm1Var.a;
                hm5.M(objJ);
            }
            m231Var = (uio) ((uv00) objJ).a(uio.class, str).b;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, onm onmVar) throws Throwable {
        cqm1 cqm1Var;
        if (onmVar instanceof cqm1) {
            cqm1Var = (cqm1) onmVar;
            int i = cqm1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cqm1Var.d = i - Integer.MIN_VALUE;
            } else {
                cqm1Var = new cqm1(this, onmVar);
            }
        } else {
            cqm1Var = new cqm1(this, onmVar);
        }
        Object objE = cqm1Var.b;
        int i2 = cqm1Var.d;
        String strE = "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt";
        xrm1 xrm1Var = this.e;
        if (i2 == 0) {
            hm5.M(objE);
            if (!this.f.a(str)) {
                xrm1Var.getClass();
                return new zpm1("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", str);
            }
            cqm1Var.a = str;
            cqm1Var.d = 1;
            objE = e(str, cqm1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cqm1Var.a;
            hm5.M(objE);
        }
        uio uioVar = (uio) objE;
        if (uioVar == null) {
            xrm1Var.getClass();
            return new zpm1("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", str);
        }
        String str2 = uioVar.a;
        if (str2.length() != 0) {
            str = str2;
        }
        rio rioVar = uioVar.b;
        if (rioVar instanceof rio) {
            strE = rioVar.E();
        } else {
            xrm1Var.getClass();
        }
        return new zpm1(strE, str);
    }
}
