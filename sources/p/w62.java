package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w62 implements c2e, y3c {
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public w62(rmr rmrVar, ruz ruzVar, PlayOrigin playOrigin, muz muzVar, tgt0 tgt0Var, qns0 qns0Var, vb2 vb2Var, boolean z, xdp xdpVar, ydp ydpVar, Flowable flowable, Scheduler scheduler) {
        this.h = new rku();
        new SerialDisposable();
        this.i = PlayerState.EMPTY;
        zdp zdpVar = (zdp) xdpVar.a.c;
        yqg yqgVar = (yqg) zdpVar.a.c.get();
        g3z g3zVar = zdpVar.a;
        this.e = new qxr(rmrVar, playOrigin, yqgVar, (xrc0) g3zVar.k.get(), (b7r0) g3zVar.l.get(), new nbc((byte) 19), (q8n) g3zVar.u.get());
        zdp zdpVar2 = (zdp) ydpVar.a.c;
        b7r0 b7r0Var = (b7r0) zdpVar2.a.l.get();
        g3z g3zVar2 = zdpVar2.a;
        boolean z2 = false;
        this.f = new xfs(muzVar, tgt0Var, b7r0Var, new jfs((h481) g3zVar2.n.get(), (n481) g3zVar2.o.get(), new lqr(), new re4(false, false, (luk) g3zVar2.q.get()), ((dy4) g3zVar2.r.get()).a(), new re4(false, false, (luk) g3zVar2.q.get()).a()), (Scheduler) g3zVar2.t.get());
        this.g = rmrVar;
        this.c = ruzVar;
        Set set = s4b1.f;
        Bundle bundle = ((g7z) rmrVar.b).b;
        v5b1 v5b1Var = uic.x(bundle != null ? bundle.getString("extra_playback_context_uri") : null).d;
        b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
        if (rmrVar.c() != null && (rmrVar.c() instanceof trc0) && (u890.j(type, wyu0.f) || u890.j(type, nyu0.e))) {
            z2 = true;
        }
        this.d = Boolean.valueOf(z2);
        flowable.L(scheduler);
        this.j = qns0Var;
        this.k = vb2Var;
        this.b = z;
    }

    public static final /* synthetic */ en70 c(w62 w62Var) {
        return (en70) w62Var.g;
    }

    public static d2e0 d(vzr0 vzr0Var, long j, long j2) {
        c2e0 c2e0Var = new c2e0(vzr0Var.a, vzr0Var.b, j);
        rsb1 rsb1Var = vzr0Var.d;
        c2e0Var.d = rsb1Var.c;
        c2e0Var.e = rsb1Var.d;
        c2e0Var.f = j2;
        c2e0Var.g = rsb1Var.b;
        return new d2e0(c2e0Var);
    }

    public static Object f(w62 w62Var, String str, boolean z, String str2, jp60 jp60Var) {
        return w62Var.b(str, ice0.a, false, z, str2, null, false, null, jp60Var);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.lang.Throwable, p.sy21] */
    public Object b(String str, ice0 ice0Var, boolean z, boolean z2, String str2, String str3, boolean z3, String str4, onm onmVar) {
        e2e e2eVar;
        int i;
        Object obj;
        w62 w62Var;
        sy21 m231Var;
        ?? r7;
        Throwable thA;
        sy21 sy21Var;
        ry21 ry21Var;
        sy21 sy21Var2;
        up60 up60Var;
        ice0 ice0Var2 = ice0Var;
        boolean z4 = z3;
        zsc zscVar = (zsc) this.f;
        yqg yqgVar = (yqg) this.d;
        w25 w25Var = (w25) this.i;
        if (onmVar instanceof e2e) {
            e2eVar = (e2e) onmVar;
            int i2 = e2eVar.f;
            if ((i2 & os00.INVALID_ID) != 0) {
                e2eVar.f = i2 - os00.INVALID_ID;
            } else {
                e2eVar = new e2e(this, onmVar);
            }
        } else {
            e2eVar = new e2e(this, onmVar);
        }
        Object objB = e2eVar.d;
        int i3 = e2eVar.f;
        if (i3 == 0) {
            hm5.M(objB);
            try {
                d2e d2eVar = (d2e) this.c;
                String strL = ((yjq) this.k).l();
                String id = yqgVar.g().getID();
                String strE = e(z2, ice0Var2);
                String strK = ((emm) this.h).a.k();
                String strZ = upn1.z(upn1.q());
                String str5 = null;
                try {
                    boolean zH = w25Var.h();
                    if (w25Var.k()) {
                        str5 = str3;
                    }
                    try {
                        Object objValueOf = Boolean.valueOf(xoi1.b((Context) this.j));
                        if (!w25Var.P()) {
                            objValueOf = str5;
                        }
                        ?? r21 = z4 ? Boolean.TRUE : str5;
                        e2eVar.a = ice0Var2;
                        e2eVar.b = this;
                        e2eVar.c = z4;
                        e2eVar.f = 1;
                        e2e e2eVar2 = e2eVar;
                        i = 1;
                        obj = null;
                        try {
                            objB = d2eVar.b(strE, strK, zH, str5, objValueOf, "home", str, strL, id, z, strZ, str2, (Boolean) r21, str4, e2eVar2);
                            d9n d9nVar = d9n.a;
                            if (objB == d9nVar) {
                                return d9nVar;
                            }
                            w62Var = this;
                            obj = obj;
                            m231Var = (sy21) objB;
                            r7 = obj;
                        } catch (Throwable th) {
                            th = th;
                            w62Var = this;
                            m231Var = new m231(th);
                            r7 = obj;
                            if (!(m231Var instanceof m231)) {
                                sy21Var2 = m231Var;
                                zscVar.E(sy21Var2, (Throwable) r7);
                                if (!z4) {
                                    tp60 tp60Var = (tp60) this.g;
                                    if (o0c.D(sy21Var2, yqgVar)) {
                                        up60Var = new up60(i);
                                    } else {
                                        up60Var = new up60(i);
                                    }
                                    tp60Var.i(up60Var);
                                }
                            }
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                zscVar.E((sy21) r7, thA);
                            }
                            hm5.M(m231Var);
                            sy21Var = m231Var;
                            w62Var.getClass();
                            ry21Var = sy21Var.a;
                            if (ry21Var.Q0) {
                                return sy21Var;
                            }
                            k220.i(ab80.n("HTTP ", " ", ry21Var.d, ry21Var.c));
                            return r7;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = 1;
                        obj = str5;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = 1;
                    obj = null;
                }
            } catch (Throwable th4) {
                th = th4;
                i = 1;
                obj = null;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = e2eVar.c;
            w62 w62Var2 = e2eVar.b;
            ice0 ice0Var3 = e2eVar.a;
            try {
                hm5.M(objB);
                w62Var = w62Var2;
                obj = null;
                z4 = z5;
                ice0Var2 = ice0Var3;
                i = 1;
                try {
                    m231Var = (sy21) objB;
                    r7 = obj;
                } catch (Throwable th5) {
                    th = th5;
                    m231Var = new m231(th);
                    r7 = obj;
                }
            } catch (Throwable th6) {
                th = th6;
                w62Var = w62Var2;
                obj = null;
                z4 = z5;
                ice0Var2 = ice0Var3;
                i = 1;
                m231Var = new m231(th);
                r7 = obj;
                if (!(m231Var instanceof m231)) {
                    sy21Var2 = m231Var;
                    zscVar.E(sy21Var2, (Throwable) r7);
                    if (!z4) {
                        tp60 tp60Var2 = (tp60) this.g;
                        if (o0c.D(sy21Var2, yqgVar)) {
                            up60Var = new up60(i);
                        } else {
                            up60Var = new up60(i);
                        }
                        tp60Var2.i(up60Var);
                    }
                }
                thA = e331.a(m231Var);
                if (thA != null) {
                    zscVar.E((sy21) r7, thA);
                }
                hm5.M(m231Var);
                sy21Var = m231Var;
                w62Var.getClass();
                ry21Var = sy21Var.a;
                if (ry21Var.Q0) {
                    return sy21Var;
                }
                k220.i(ab80.n("HTTP ", " ", ry21Var.d, ry21Var.c));
                return r7;
            }
        }
        if (!(m231Var instanceof m231)) {
            sy21Var2 = m231Var;
            zscVar.E(sy21Var2, (Throwable) r7);
            if (!z4) {
                tp60 tp60Var3 = (tp60) this.g;
                if (o0c.D(sy21Var2, yqgVar) || ice0Var2 == ice0.a) {
                    up60Var = new up60(i);
                } else {
                    up60Var = new up60(2);
                }
                tp60Var3.i(up60Var);
            }
        }
        thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof CancellationException)) {
            zscVar.E((sy21) r7, thA);
        }
        hm5.M(m231Var);
        sy21Var = m231Var;
        w62Var.getClass();
        ry21Var = sy21Var.a;
        if (ry21Var.Q0) {
            return sy21Var;
        }
        k220.i(ab80.n("HTTP ", " ", ry21Var.d, ry21Var.c));
        return r7;
    }

    public String e(boolean z, ice0 ice0Var) {
        if (this.b) {
            upc upcVar = upc.n;
            upcVar.getClass();
            return nyn1.Z(upcVar);
        }
        if (((dp60) this.e).a.h(dp60.b, false)) {
            return "no-cache";
        }
        if (ice0Var == ice0.a) {
            upc upcVar2 = upc.o;
            upcVar2.getClass();
            return nyn1.Z(upcVar2);
        }
        if (ice0Var == ice0.f) {
            upc upcVar3 = upc.n;
            upcVar3.getClass();
            return nyn1.Z(upcVar3);
        }
        if (z || ice0Var != ice0.b) {
            return "";
        }
        upc upcVar4 = upc.o;
        upcVar4.getClass();
        return nyn1.Z(upcVar4);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    public JSONObject g(Intent intent) {
        dn81 dn81VarA;
        u3c u3cVar = ((r2b1) this.d).a;
        if (intent.getBooleanExtra("forwarded_by_login_flow", false)) {
            if (intent.getDataString() != null) {
                Uri data = intent.getData();
                if (!u890.j(data != null ? data.toString() : null, nik1.z0.a)) {
                    u3cVar.getClass();
                    dn81VarA = u3c.a();
                    if (dn81VarA != null) {
                        return ((n3c) dn81VarA.b).i();
                    }
                }
            }
            u3cVar.getClass();
            dn81 dn81VarA2 = u3c.a();
            if (dn81VarA2 != null) {
                return n3c.d(((n3c) dn81VarA2.b).b.F("bnc_install_params"));
            }
        } else {
            u3cVar.getClass();
            dn81VarA = u3c.a();
            if (dn81VarA != null) {
                return ((n3c) dn81VarA.b).i();
            }
        }
        return null;
    }

    public void h() {
        dm5.y(this.b);
        Uri uri = (Uri) this.f;
        uri.getClass();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        dqu dquVar = (dqu) this.g;
        dquVar.getClass();
        mk60 mk60Var = (mk60) dquVar.b;
        dm5.y(mk60Var.k);
        for (Map.Entry entry : new TreeMap((Map) j380.m("_HLS_pathway", mk60Var.l, "_HLS_throughput", String.valueOf(mk60Var.c.f()))).entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        Map map = Collections.EMPTY_MAP;
        Uri uriBuild = builderBuildUpon.build();
        uriBuild.getClass();
        vzr0 vzr0Var = new vzr0(((nay) this.c).j(), new n3r(uriBuild, 0L, 1, null, map, 0L, -1L, null, 0, null), 8, new jxa((byte) 26));
        eyh0 eyh0Var = (eyh0) this.k;
        eyh0Var.getClass();
        eyh0Var.H(vzr0Var, (up41) this.d, 0);
    }

    public Completable i(final String str, final String str2, final long j, final tv80 tv80Var, final long j2, final long j3) {
        return this.b ? ((qns0) this.j).b("episode-defaultplaypauseinteractor", Collections.singletonList(str2), false).map(new hfr(str2, (byte) 3)).onErrorReturnItem(xa2.a).flatMapCompletable(new Function() { // from class: p.yes
            public final Object apply(Object obj) {
                za2 za2Var = (za2) obj;
                boolean z = za2Var instanceof ya2;
                w62 w62Var = this.a;
                tv80 tv80Var2 = tv80Var;
                if (!z) {
                    return w62Var.j(str, str2, j, tv80Var2, j2, j3);
                }
                int i = ((ya2) za2Var).a;
                ((vb2) w62Var.k).c(new te2(new db2(i)), true, tv80Var2, (Intent) null);
                return CompletableEmpty.a;
            }
        }) : j(str, str2, j, tv80Var, j2, j3);
    }

    public Completable j(String str, String str2, long j, tv80 tv80Var, long j2, long j3) {
        Single singleA;
        String strBuild;
        xfs xfsVar = (xfs) this.f;
        ruz ruzVar = (ruz) this.c;
        g7z g7zVar = (g7z) ((rmr) this.g).b;
        if (((PlayerState) this.i).isPlaying()) {
            spq0 spq0VarTrack = ((PlayerState) this.i).track();
            if (spq0VarTrack.c() && ((ContextTrack) spq0VarTrack.b()).uri().equals(str2) && j >= 0) {
                Single singleA2 = ruzVar.a(new i9u0(j));
                if (((PlayerState) this.i).isPaused()) {
                    singleA2 = singleA2.flatMap(new thn(ruzVar.a(new g9u0("episode-defaultplaypauseinteractor", false)), (byte) 8));
                }
                return Completable.k(singleA2);
            }
        }
        ou80 ou80Var = tv80Var != null ? tv80Var.a : null;
        String str3 = ou80Var != null ? ou80Var.a : "";
        Bundle bundle = g7zVar.b;
        String string = bundle != null ? bundle.getString("extra_playback_context_uri") : null;
        if (jhc1.F(string)) {
            j6v0 j6v0Var = new j6v0(str, str2, j, str3, Long.valueOf(j2), Long.valueOf(j3));
            jfs jfsVar = xfsVar.d;
            lqr lqrVar = jfsVar.c;
            if (jfsVar.d.b()) {
                e481 e481VarE = lqrVar.e(str2);
                Set set = s4b1.f;
                String strH = uic.x(str).h();
                q8z q8zVar = new q8z(str2);
                Integer num = e481VarE.o;
                if (num == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                singleA = jfsVar.b.a(new b481(strH, new r8z(q8zVar, num.intValue()), 0, (azo1) null, e481VarE.b, e481VarE.c, e481VarE.g, 130732)).map(uwg.a1);
            } else {
                h481 h481Var = jfsVar.a;
                Set set2 = s4b1.f;
                singleA = h481Var.a(uic.x(str).h(), lqrVar.e(str2));
            }
            return singleA.map(new iir(jfsVar, str, (byte) 17)).cache().observeOn(xfsVar.e).flatMapCompletable(new wfs(j6v0Var, xfsVar, j6v0Var));
        }
        if (!((Boolean) this.d).booleanValue()) {
            Bundle bundle2 = g7zVar.b;
            String string2 = bundle2 != null ? bundle2.getString("extra_playback_row_id") : null;
            boolean z = g7zVar.i;
            strBuild = string2 != null ? SkipToTrack.builder().pageIndex(0L).trackUid(string2).trackIndex(0L).build() : null;
            com.spotify.player.model.Context contextFromUri = com.spotify.player.model.Context.fromUri(string);
            PreparePlayOptions preparePlayOptionsA = qot0.a(strBuild, j, (Long) null, z, 4);
            tgt0 tgt0Var = xfsVar.b;
            contextFromUri.getClass();
            PlayCommand.Builder builderOptions = PlayCommand.builder(contextFromUri, tgt0Var.a).options(preparePlayOptionsA);
            builderOptions.loggingParams(xfsVar.a(str3));
            return xfsVar.a.a(builderOptions.build()).ignoreElement();
        }
        qxr qxrVar = (qxr) this.e;
        Bundle bundle3 = g7zVar.b;
        String string3 = bundle3 != null ? bundle3.getString("extra_playback_row_id") : null;
        c8z c8zVar = new c8z(string, string3, j, ou80Var);
        rmr rmrVar = qxrVar.a;
        if (rmrVar.c() == null || !(rmrVar.c() instanceof trc0)) {
            eg.m("Attempting to play using a playlist without passing the PlaylistEndpoint.Configuration. Did you forget to pass it to the Episode fragment?");
            return null;
        }
        SkipToTrack skipToTrackBuild = SkipToTrack.builder().trackUid(string3).build();
        coz cozVarR = EsLoggingParams.LoggingParams.r();
        String str4 = ou80Var != null ? ou80Var.a : null;
        if (str4 == null) {
            str4 = "";
        }
        cozVarR.n(str4);
        y6r0 y6r0Var = qxrVar.e.get();
        strBuild = y6r0Var != null ? y6r0Var.a : null;
        cozVarR.q(strBuild != null ? strBuild : "");
        qpz qpzVarP = EsOptional.OptionalInt64.p();
        qpzVarP.n(qxrVar.c.b());
        cozVarR.t(qpzVarP);
        return j2h1.D(qxrVar.f, new swn(qxrVar, c8zVar, skipToTrackBuild, cozVarR.build(), (lnm) null, (byte) 9));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00a2, please report this as an issue */
    public boolean k(Intent intent, boolean z, JSONObject jSONObject, String str) {
        String strK;
        String strR;
        wcr wcrVar = (wcr) this.h;
        if (str != null) {
            String strConcat = "Branch error: ".concat(str);
            if (z) {
                wcrVar.c(2, intent, strConcat);
                return false;
            }
        } else if (this.b) {
            if (jSONObject != null) {
                f4t f4tVar = f4t.b;
                if (jSONObject.optBoolean("+clicked_branch_link")) {
                    if (jSONObject.has("$full_url")) {
                        strR = jSONObject.optString("$full_url");
                    } else {
                        y3c.a.getClass();
                        String str2 = x3c.b;
                        if (jSONObject.has(str2)) {
                            strR = jSONObject.optString(str2);
                        } else {
                            String str3 = x3c.c;
                            if (jSONObject.has(str3)) {
                                strR = oon1.r(jSONObject.optString(str3));
                            } else {
                                String str4 = x3c.d;
                                strR = jSONObject.has(str4) ? oon1.r(jSONObject.optString(str4)) : null;
                            }
                        }
                    }
                    String str5 = strR;
                    if (str5 != null) {
                        fn31.T((llm) this.k, (q8n) this.c, 0, new wba1(this, jSONObject, intent, str5, (lnm) null, (byte) 2), 2);
                        return true;
                    }
                    String strK2 = jhc1.K("Branch link opened the app but no deep link parameter was attached to the link.\n                     |Link properties:\n                     |" + jSONObject + "\n                  ");
                    if (z) {
                        wcrVar.c(2, intent, strK2);
                        return false;
                    }
                } else {
                    strK = jhc1.K("LinkProperties object doesn't contain +clicked_branch_link param or it's not true.\n                        |Link Properties:\n                        |" + jSONObject + "\n                    ");
                    if (z) {
                        wcrVar.c(2, intent, strK);
                    }
                }
            } else {
                strK = jhc1.K("LinkProperties object doesn't contain +clicked_branch_link param or it's not true.\n                        |Link Properties:\n                        |" + jSONObject + "\n                    ");
                if (z) {
                    wcrVar.c(2, intent, strK);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    public boolean l(Intent intent, Activity activity, ptb ptbVar) {
        boolean z;
        boolean zK;
        this.b = true;
        boolean z2 = false;
        if (intent != null) {
            Uri data = intent.getData();
            if (u890.j(data != null ? data.toString() : null, nik1.z0.a)) {
                boolean booleanExtra = intent.getBooleanExtra("forwarded_by_login_flow", false);
                boolean booleanExtra2 = intent.getBooleanExtra("branch_used", false);
                JSONObject jSONObjectG = g(intent);
                if ((booleanExtra2 || booleanExtra) && jSONObjectG != null) {
                    f4t f4tVar = f4t.b;
                    if (jSONObjectG.optBoolean("+clicked_branch_link")) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            String dataString = intent.getDataString();
            boolean z3 = dataString != null && ((uz71) this.i).f(dataString);
            if (intent.getData() == null || z3 || z) {
                if (z3) {
                    String strR = m5n1.R(intent);
                    String dataString2 = intent.getDataString();
                    dataString2.getClass();
                    ((ae5) this.j).f(strR, dataString2);
                }
                boolean booleanExtra3 = intent.getBooleanExtra("forwarded_by_login_flow", false);
                boolean booleanExtra4 = intent.getBooleanExtra("branch_used", false);
                JSONObject jSONObjectG2 = g(intent);
                if ((booleanExtra4 || booleanExtra3) && jSONObjectG2 != null) {
                    f4t f4tVar2 = f4t.b;
                    if (jSONObjectG2.optBoolean("+clicked_branch_link")) {
                        zK = k(intent, !z3, g(intent), null);
                    } else {
                        zK = false;
                    }
                } else {
                    zK = false;
                }
                if (zK) {
                    z2 = true;
                } else if (z3) {
                    r2b1 r2b1Var = (r2b1) this.d;
                    yt91 yt91Var = new yt91(this, intent, ptbVar, (byte) 16);
                    Uri data2 = intent.getData();
                    Intent intent2 = activity.getIntent();
                    intent2.removeExtra(eqq.h(3));
                    intent2.putExtra(eqq.h(2), true);
                    r2b1Var.d(new p2b1(r2b1Var, activity, yt91Var, data2, true));
                    z2 = true;
                }
                if (z2) {
                    Boolean bool = Boolean.TRUE;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    String dataString3 = intent.getDataString();
                    Logger.b("[SpotifyBranchRouting] Link received: originalLink=%s, loggedIn=%s, isDeferredDeeplink=%s, shortlinkSessionId=%s", new Object[]{dataString, bool, boolValueOf, dataString3 != null ? m5n1.C(dataString3) : null});
                }
                return z2;
            }
        }
        return false;
    }

    public w62(q62 q62Var, rm5 rm5Var, xug0 xug0Var, boolean z, qr20 qr20Var, q8n q8nVar, bbr0 bbr0Var) {
        this.c = q62Var;
        this.d = rm5Var;
        this.e = xug0Var;
        this.b = z;
        this.f = qr20Var;
        this.g = new en70(bbr0Var.b0(bn70.class));
        this.k = smo1.e(flo1.l(guo1.B(), q8nVar).y(new v62(olj0.T0, (byte) 0)));
    }

    public w62(q8n q8nVar, r2b1 r2b1Var, lzn0 lzn0Var, jnq jnqVar, Activity activity, wcr wcrVar, uz71 uz71Var, ae5 ae5Var) {
        this.c = q8nVar;
        this.d = r2b1Var;
        this.e = lzn0Var;
        this.f = jnqVar;
        this.g = activity;
        this.h = wcrVar;
        this.i = uz71Var;
        this.j = ae5Var;
        this.k = smo1.e(flo1.l(op71.f(), q8nVar));
    }

    public w62(d2e d2eVar, yqg yqgVar, dp60 dp60Var, zsc zscVar, tp60 tp60Var, emm emmVar, boolean z, w25 w25Var, Context context, zov0 zov0Var, yjq yjqVar) {
        this.c = d2eVar;
        this.d = yqgVar;
        this.e = dp60Var;
        this.f = zscVar;
        this.g = tp60Var;
        this.h = emmVar;
        this.b = z;
        this.i = w25Var;
        this.j = context;
        this.k = yjqVar;
    }

    public w62(kui0 kui0Var, kui0 kui0Var2, kui0 kui0Var3, kui0 kui0Var4, kui0 kui0Var5, bjx bjxVar, typ typVar, rh4 rh4Var, hoc hocVar, boolean z) {
        this.c = kui0Var;
        this.d = kui0Var2;
        this.e = kui0Var3;
        this.f = kui0Var4;
        this.g = kui0Var5;
        this.h = bjxVar;
        this.i = typVar;
        this.j = rh4Var;
        this.k = hocVar;
        this.b = z;
    }

    public w62(nay nayVar) {
        this.c = nayVar;
        this.d = new up41(this, (byte) 23);
        this.e = new wdd1(new Handler(zoi1.D(), null));
    }
}
