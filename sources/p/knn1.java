package p;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.internal.zzap;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class knn1 extends sxn1 {
    public static final String u;
    public long e;
    public j3i0 f;
    public Long g;
    public hql1 h;
    public int i;
    public final mon1 j;
    public final mon1 k;
    public final mon1 l;
    public final mon1 m;
    public final mon1 n;
    public final mon1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mon1 f20p;
    public final mon1 q;
    public final mon1 r;
    public final mon1 s;
    public final mon1 t;

    static {
        Pattern pattern = o4e.a;
        u = "urn:x-cast:com.google.cast.media";
    }

    public knn1() {
        super(u);
        this.i = -1;
        mon1 mon1Var = new mon1(86400000L, "load");
        this.j = mon1Var;
        mon1 mon1Var2 = new mon1(86400000L, "pause");
        this.k = mon1Var2;
        mon1 mon1Var3 = new mon1(86400000L, "play");
        this.l = mon1Var3;
        mon1 mon1Var4 = new mon1(86400000L, "stop");
        mon1 mon1Var5 = new mon1(10000L, "seek");
        this.m = mon1Var5;
        mon1 mon1Var6 = new mon1(86400000L, "volume");
        this.n = mon1Var6;
        mon1 mon1Var7 = new mon1(86400000L, "mute");
        this.o = mon1Var7;
        mon1 mon1Var8 = new mon1(86400000L, "status");
        this.f20p = mon1Var8;
        mon1 mon1Var9 = new mon1(86400000L, "activeTracks");
        mon1 mon1Var10 = new mon1(86400000L, "trackStyle");
        mon1 mon1Var11 = new mon1(86400000L, "queueInsert");
        mon1 mon1Var12 = new mon1(86400000L, "queueUpdate");
        this.q = mon1Var12;
        mon1 mon1Var13 = new mon1(86400000L, "queueRemove");
        mon1 mon1Var14 = new mon1(86400000L, "queueReorder");
        mon1 mon1Var15 = new mon1(86400000L, "queueFetchItemIds");
        this.r = mon1Var15;
        mon1 mon1Var16 = new mon1(86400000L, "queueFetchItemRange");
        this.t = mon1Var16;
        this.s = new mon1(86400000L, "queueFetchItems");
        mon1 mon1Var17 = new mon1(86400000L, "setPlaybackRate");
        mon1 mon1Var18 = new mon1(86400000L, "skipAd");
        a(mon1Var);
        a(mon1Var2);
        a(mon1Var3);
        a(mon1Var4);
        a(mon1Var5);
        a(mon1Var6);
        a(mon1Var7);
        a(mon1Var8);
        a(mon1Var9);
        a(mon1Var10);
        a(mon1Var11);
        a(mon1Var12);
        a(mon1Var13);
        a(mon1Var14);
        a(mon1Var15);
        a(mon1Var16);
        a(mon1Var16);
        a(mon1Var17);
        a(mon1Var18);
        m();
    }

    public static int[] h(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public static den1 n(JSONObject jSONObject) {
        MediaError.j(jSONObject);
        den1 den1Var = new den1();
        Pattern pattern = o4e.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return den1Var;
    }

    public final void d(gon1 gon1Var, int i) {
        JSONObject jSONObject = new JSONObject();
        long jC = c();
        try {
            jSONObject.put("requestId", jC);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", e());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            int i2 = this.i;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        b(jC, jSONObject.toString());
        this.q.a(jC, new bym1(this, gon1Var));
    }

    public final long e() throws zzap {
        j3i0 j3i0Var = this.f;
        if (j3i0Var != null) {
            return j3i0Var.b;
        }
        throw new zzap();
    }

    public final long f(double d, long j, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (jElapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    public final void g(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            ((sxn1) this).a.c(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    public final void i() {
        hql1 hql1Var = this.h;
        if (hql1Var != null) {
            e321 e321Var = (e321) hql1Var.a;
            Iterator it = e321Var.i.values().iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    bhn0.d();
                    return;
                } else {
                    if (!e321Var.g() && e321Var.g()) {
                        throw null;
                    }
                    throw null;
                }
            }
            Iterator it2 = e321Var.g.iterator();
            if (it2.hasNext()) {
                throw pze0.g(it2);
            }
            for (oxo1 oxo1Var : e321Var.h) {
                switch (oxo1Var.a) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        koh0 koh0Var = (koh0) oxo1Var.b;
                        long jG = koh0Var.g();
                        if (jG != koh0Var.a) {
                            koh0Var.a = jG;
                            koh0Var.d();
                            if (koh0Var.a != 0) {
                                koh0Var.e();
                            }
                        }
                        break;
                    case 1:
                        b4e b4eVar = (b4e) oxo1Var.b;
                        e321 e321Var2 = b4eVar.j;
                        j3i0 j3i0VarD = e321Var2 != null ? e321Var2.d() : null;
                        utw0 utw0Var = b4eVar.l;
                        if (utw0Var != null && j3i0VarD != null) {
                            nbn1 nbn1VarA = ((e821) utw0Var.a).A();
                            ho41 ho41Var = new ho41();
                            ho41Var.a = j3i0VarD.e;
                            vua vuaVar = new vua(ho41Var);
                            vua vuaVar2 = nbn1VarA.m;
                            if (vuaVar2 == null || vuaVar2.a != 2) {
                                vuaVar.c = nbn1VarA.h;
                                nbn1VarA.m = vuaVar;
                            }
                        }
                        break;
                    default:
                        ((a8p1) oxo1Var.b).c();
                        break;
                }
            }
        }
    }

    public final void j() {
        hql1 hql1Var = this.h;
        if (hql1Var != null) {
            e321 e321Var = (e321) hql1Var.a;
            Iterator it = e321Var.g.iterator();
            if (it.hasNext()) {
                throw pze0.g(it);
            }
            for (oxo1 oxo1Var : e321Var.h) {
                switch (oxo1Var.a) {
                    case 2:
                        ((a8p1) oxo1Var.b).c();
                        break;
                }
            }
        }
    }

    public final void k() {
        hql1 hql1Var = this.h;
        if (hql1Var != null) {
            e321 e321Var = (e321) hql1Var.a;
            Iterator it = e321Var.g.iterator();
            if (it.hasNext()) {
                throw pze0.g(it);
            }
            for (oxo1 oxo1Var : e321Var.h) {
                switch (oxo1Var.a) {
                    case 2:
                        ((a8p1) oxo1Var.b).c();
                        break;
                }
            }
        }
    }

    public final void l() {
        hql1 hql1Var = this.h;
        if (hql1Var != null) {
            e321 e321Var = (e321) hql1Var.a;
            Iterator it = e321Var.g.iterator();
            if (it.hasNext()) {
                throw pze0.g(it);
            }
            for (oxo1 oxo1Var : e321Var.h) {
                switch (oxo1Var.a) {
                    case 2:
                        ((a8p1) oxo1Var.b).c();
                        break;
                }
            }
        }
    }

    public final void m() {
        this.e = 0L;
        this.f = null;
        Iterator it = ((sxn1) this).d.iterator();
        while (it.hasNext()) {
            ((mon1) it.next()).e();
        }
    }

    public final long o() {
        pqh0 pqh0Var;
        j3i0 j3i0Var = this.f;
        MediaInfo mediaInfo = j3i0Var == null ? null : j3i0Var.a;
        long jF = 0;
        if (mediaInfo != null && j3i0Var != null) {
            Long l = this.g;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    j3i0 j3i0Var2 = this.f;
                    if (j3i0Var2.U0 != null) {
                        long jLongValue = l.longValue();
                        j3i0 j3i0Var3 = this.f;
                        if (j3i0Var3 != null && (pqh0Var = j3i0Var3.U0) != null) {
                            long j = pqh0Var.b;
                            jF = !pqh0Var.d ? f(1.0d, j, -1L) : j;
                        }
                        return Math.min(jLongValue, jF);
                    }
                    MediaInfo mediaInfo2 = j3i0Var2 == null ? null : j3i0Var2.a;
                    if ((mediaInfo2 != null ? mediaInfo2.e : 0L) >= 0) {
                        long jLongValue2 = l.longValue();
                        j3i0 j3i0Var4 = this.f;
                        MediaInfo mediaInfo3 = j3i0Var4 != null ? j3i0Var4.a : null;
                        return Math.min(jLongValue2, mediaInfo3 != null ? mediaInfo3.e : 0L);
                    }
                }
                return l.longValue();
            }
            if (this.e != 0) {
                double d = j3i0Var.d;
                long j2 = j3i0Var.g;
                return (d == 0.0d || j3i0Var.e != 2) ? j2 : f(d, j2, mediaInfo.e);
            }
        }
        return 0L;
    }
}
