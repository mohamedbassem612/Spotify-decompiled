package p;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import j$.time.Clock;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class iyh1 implements cdd1, se21, yg30, mnm, gka1, i2q0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iyh1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                k3q k3qVar = (k3q) obj3;
                qop qopVar = (qop) obj;
                lbt lbtVar = (lbt) obj2;
                daq daqVar = k3qVar.a;
                teq teqVar = k3qVar.b;
                l3q l3qVar = new l3q(daqVar, teqVar);
                qopVar.getClass();
                lbtVar.getClass();
                return new bn1(qopVar.d(), lbtVar.b, (hsq) new k2q(l3qVar, qopVar, lbtVar).c, new hod0(teqVar.B(), (byte) 21));
            case 2:
            case 3:
            case 4:
            case 8:
            case 10:
            case 11:
            case 14:
            case 15:
            case 16:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            default:
                gl90 gl90Var = (gl90) obj2;
                daq daqVar2 = ((n0q) obj3).b;
                ((qop) obj).getClass();
                gl90Var.getClass();
                koc0 koc0Var = gl90Var.c;
                me30 me30Var = (me30) daqVar2.w7.get();
                c8o.l(me30Var);
                return new lna0(new frl1(koc0Var, me30Var, (byte) 4));
            case 5:
                jbq jbqVar = (jbq) obj3;
                qop qopVar2 = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                daq daqVar3 = jbqVar.a;
                teq teqVar2 = jbqVar.b;
                y0q y0qVar = new y0q(daqVar3, teqVar2, (byte) 8);
                qopVar2.getClass();
                jbtVar.getClass();
                jnq jnqVar = new jnq(y0qVar, qopVar2, jbtVar);
                z6k0 z6k0Var = (z6k0) teqVar2.Z5.get();
                c8o.l(z6k0Var);
                String strD = qopVar2.d();
                d2f1 d2f1VarP3 = teqVar2.P3();
                String strD2 = qopVar2.d();
                koc0 koc0Var2 = jbtVar.d;
                ov20 ov20Var = (ov20) daqVar3.P5.get();
                c8o.l(ov20Var);
                d2f1 d2f1VarP4 = teqVar2.P3();
                ptf1 ptf1VarK = jnqVar.k();
                new cua(false);
                me30 me30Var2 = (me30) daqVar3.w7.get();
                c8o.l(me30Var2);
                r4h1 r4h1Var = new r4h1();
                r4h1Var.a = strD2;
                r4h1Var.b = koc0Var2;
                r4h1Var.c = ov20Var;
                r4h1Var.d = d2f1VarP4;
                r4h1Var.e = ptf1VarK;
                r4h1Var.f = me30Var2;
                hsq hsqVar = (hsq) jnqVar.d;
                me30 me30Var3 = (me30) daqVar3.w7.get();
                c8o.l(me30Var3);
                return new dfv(z6k0Var, strD, d2f1VarP3, r4h1Var, hsqVar, me30Var3);
            case 6:
                k3q k3qVar2 = (k3q) obj3;
                qop qopVar3 = (qop) obj;
                act actVar = (act) obj2;
                daq daqVar4 = k3qVar2.a;
                teq teqVar3 = k3qVar2.b;
                qopVar3.getClass();
                actVar.getClass();
                rzq rzqVar = actVar.c;
                c8o.l(rzqVar);
                String strD3 = qopVar3.d();
                z6k0 z6k0Var2 = (z6k0) teqVar3.Z5.get();
                c8o.l(z6k0Var2);
                koc0 koc0Var3 = actVar.f;
                ov20 ov20Var2 = (ov20) daqVar4.P5.get();
                c8o.l(ov20Var2);
                d2f1 d2f1VarP5 = teqVar3.P3();
                cua cuaVar = new cua(false);
                me30 me30Var4 = (me30) daqVar4.w7.get();
                c8o.l(me30Var4);
                q8n q8nVar = (q8n) daqVar4.E1.get();
                c8o.l(q8nVar);
                return new amj1(rzqVar, strD3, z6k0Var2, koc0Var3, ov20Var2, d2f1VarP5, cuaVar, me30Var4, q8nVar);
            case 7:
                fl90 fl90Var = (fl90) obj2;
                i3q i3qVar = new i3q(((a0q) obj3).a);
                ((qop) obj).getClass();
                fl90Var.getClass();
                jnq jnqVar2 = (jnq) ((muq) ((jly0) new jnq(i3qVar, fl90Var).b).get()).a.c;
                bk90 bk90Var = ((fl90) jnqVar2.c).d;
                c8o.l(bk90Var);
                return new cqj1(bk90Var, (nuq) ((jly0) jnqVar2.a).get());
            case 9:
                qop qopVar4 = (qop) obj;
                bct bctVar = (bct) obj2;
                teq teqVar4 = ((b0q) obj3).a;
                ibq ibqVar = new ibq(teqVar4);
                qopVar4.getClass();
                bctVar.getClass();
                jmq jmqVar = new jmq(ibqVar, qopVar4, bctVar);
                String strD4 = qopVar4.d();
                koc0 koc0Var4 = bctVar.d;
                xuq xuqVar = (xuq) ((jly0) jmqVar.b).get();
                lzn0 lzn0Var = (lzn0) teqVar4.i.get();
                c8o.l(lzn0Var);
                return new rb3(strD4, koc0Var4, xuqVar, lzn0Var, new bih1(Locale.forLanguageTag(upn1.q()), ZoneId.of(Clock.systemDefaultZone().getZone().getId()), (byte) 16));
            case 12:
                jbq jbqVar2 = (jbq) obj3;
                qop qopVar5 = (qop) obj;
                k3q k3qVar3 = new k3q(jbqVar2.a, jbqVar2.b);
                qopVar5.getClass();
                ((nbt) obj2).getClass();
                return new e0t(qopVar5.d(), (bzo) ((jly0) new jnq(k3qVar3, qopVar5).a).get());
            case 13:
                l3q l3qVar2 = (l3q) obj3;
                qop qopVar6 = (qop) obj;
                obt obtVar = (obt) obj2;
                jbq jbqVar3 = new jbq(l3qVar2.a, l3qVar2.b);
                qopVar6.getClass();
                obtVar.getClass();
                return new q7l1(qopVar6.d(), (bvq) ((jly0) new yjq(jbqVar3, qopVar6, obtVar).b).get());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                qop qopVar7 = (qop) obj;
                teq teqVar5 = ((h0q) obj3).a;
                lzp lzpVar = new lzp(teqVar5);
                qopVar7.getClass();
                ((mbt) obj2).getClass();
                return new z2y0(qopVar7.d(), teqVar5.g4(), (evq) ((jly0) new lbq(lzpVar, qopVar7).c).get());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                qop qopVar8 = (qop) obj;
                teq teqVar6 = ((mzp) obj3).a;
                qopVar8.getClass();
                ((ubt) obj2).getClass();
                String strD5 = qopVar8.d();
                xyl1 xyl1Var = (xyl1) teqVar6.tg.get();
                c8o.l(xyl1Var);
                return new e0t(strD5, xyl1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                qop qopVar9 = (qop) obj;
                act actVar2 = (act) obj2;
                teq teqVar7 = ((l0q) obj3).a;
                qopVar9.getClass();
                actVar2.getClass();
                String strD6 = qopVar9.d();
                u9c0 u9c0VarQ = cto1.q(qopVar9.c());
                y4m1 y4m1Var = (y4m1) teqVar7.Le.get();
                c8o.l(y4m1Var);
                return new fjk0(strD6, u9c0VarQ, y4m1Var, teqVar7.i3(), teqVar7.g4(), actVar2.f);
            case 22:
                k3q k3qVar4 = (k3q) obj3;
                qop qopVar10 = (qop) obj;
                act actVar3 = (act) obj2;
                daq daqVar5 = k3qVar4.a;
                teq teqVar8 = k3qVar4.b;
                qopVar10.getClass();
                actVar3.getClass();
                String strD7 = qopVar10.d();
                Intent intentA = qopVar10.a();
                q8n q8nVar2 = (q8n) daqVar5.E1.get();
                c8o.l(q8nVar2);
                koc0 koc0Var5 = actVar3.f;
                b1r0 b1r0Var = (b1r0) teqVar8.l6.get();
                c8o.l(b1r0Var);
                return new wyl1(strD7, intentA, q8nVar2, koc0Var5, b1r0Var);
            case 23:
                l3q l3qVar3 = (l3q) obj3;
                qop qopVar11 = (qop) obj;
                bct bctVar2 = (bct) obj2;
                daq daqVar6 = l3qVar3.a;
                teq teqVar9 = l3qVar3.b;
                qopVar11.getClass();
                bctVar2.getClass();
                String strD8 = qopVar11.d();
                koc0 koc0Var6 = bctVar2.d;
                sua suaVar = new sua(new ytw0((byte) 21), (byte) 24);
                qpj1 qpj1VarG4 = teqVar9.g4();
                Context context = (Context) daqVar6.x1.a;
                c8o.l(context);
                return new mzl1(strD8, koc0Var6, suaVar, qpj1VarG4, new vbe1(context, qopVar11.d(), koc0Var6, new sua(new ytw0((byte) 21), (byte) 24), teqVar9.g4()));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                qop qopVar12 = (qop) obj;
                bct bctVar3 = (bct) obj2;
                teq teqVar10 = ((w7q) obj3).a;
                qopVar12.getClass();
                bctVar3.getClass();
                String strD9 = qopVar12.d();
                koc0 koc0Var7 = bctVar3.d;
                qpj1 qpj1VarG5 = teqVar10.g4();
                String strD10 = qopVar12.d();
                y4m1 y4m1Var2 = (y4m1) teqVar10.Le.get();
                c8o.l(y4m1Var2);
                eoc eocVar = new eoc(new xpv0((byte) 18), new nju(), (byte) 29);
                quc0 quc0Var = (quc0) teqVar10.Mb.get();
                c8o.l(quc0Var);
                d0r d0rVar = bctVar3.b;
                a1r0 a1r0Var = (a1r0) teqVar10.V0.get();
                c8o.l(a1r0Var);
                return new k5m1(strD9, koc0Var7, qpj1VarG5, new vbe1(strD10, koc0Var7, y4m1Var2, eocVar, quc0Var, d0rVar, a1r0Var));
            case 25:
                qop qopVar13 = (qop) obj;
                teq teqVar11 = ((m0q) obj3).a;
                qopVar13.getClass();
                ((gl90) obj2).getClass();
                String strD11 = qopVar13.d();
                ytw0 ytw0Var = new ytw0((byte) 21);
                y4m1 y4m1Var3 = (y4m1) teqVar11.Le.get();
                c8o.l(y4m1Var3);
                return new n5m1(strD11, ytw0Var, y4m1Var3);
            case 26:
                jbq jbqVar4 = (jbq) obj3;
                qop qopVar14 = (qop) obj;
                jbt jbtVar2 = (jbt) obj2;
                daq daqVar7 = jbqVar4.a;
                teq teqVar12 = jbqVar4.b;
                k3q k3qVar5 = new k3q(daqVar7, teqVar12);
                qopVar14.getClass();
                jbtVar2.getClass();
                jmq jmqVar2 = new jmq(k3qVar5, qopVar14, jbtVar2);
                String strD12 = qopVar14.d();
                koc0 koc0Var8 = jbtVar2.d;
                hsq hsqVar2 = (hsq) jmqVar2.c;
                xyl1 xyl1Var2 = (xyl1) teqVar12.tg.get();
                c8o.l(xyl1Var2);
                return new w5m1(strD12, koc0Var8, hsqVar2, xyl1Var2);
            case 27:
                ujq ujqVar = (ujq) obj3;
                qop qopVar15 = (qop) obj;
                bct bctVar4 = (bct) obj2;
                daq daqVar8 = ujqVar.a;
                jbq jbqVar5 = new jbq(daqVar8, ujqVar.b);
                qopVar15.getClass();
                bctVar4.getClass();
                tjq tjqVar = new tjq(jbqVar5, qopVar15, bctVar4);
                String strD13 = qopVar15.d();
                koc0 koc0Var9 = bctVar4.d;
                ttq ttqVar = (ttq) tjqVar.e;
                nfa0 nfa0Var = (nfa0) daqVar8.b2.get();
                c8o.l(nfa0Var);
                q8n q8nVar3 = (q8n) daqVar8.r2.get();
                c8o.l(q8nVar3);
                return new w7m1(strD13, koc0Var9, ttqVar, nfa0Var, q8nVar3, (o7m1) ((jly0) tjqVar.a).get());
            case 28:
                k3q k3qVar6 = (k3q) obj3;
                qop qopVar16 = (qop) obj;
                ujq ujqVar2 = new ujq(k3qVar6.a, k3qVar6.b);
                qopVar16.getClass();
                ((qbt) obj2).getClass();
                return new hbm1((hsq) new jmq(ujqVar2, qopVar16).c);
        }
    }

    public void b(bih1 bih1Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                qpj1 qpj1Var = (qpj1) obj;
                xjl1 xjl1Var = (xjl1) qpj1Var.b;
                zrw0 zrw0Var = bsw0.a;
                bsw0.a(xjl1Var.a, c2u.a);
                ohd ohdVar = (ohd) qpj1Var.c;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(new e331(rih1.a));
                }
                break;
            default:
                new Handler(Looper.getMainLooper()).post(new qub1((iyh1) obj, bih1Var, (byte) 20));
                break;
        }
    }

    public Object c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                c441 c441Var = (c441) ((ywv0) obj).i;
                SQLiteDatabase sQLiteDatabaseA = c441Var.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c441Var.b.b()).execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                cik1 cik1Var = (cik1) obj;
                SQLiteDatabase sQLiteDatabaseA2 = ((c441) cik1Var.c).a();
                sQLiteDatabaseA2.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseA2.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (cursorRawQuery.moveToNext()) {
                            ix7 ix7VarA = s29.a();
                            ix7VarA.s(cursorRawQuery.getString(1));
                            ix7VarA.d = aow0.b(cursorRawQuery.getInt(2));
                            String string = cursorRawQuery.getString(3);
                            ix7VarA.c = string == null ? null : Base64.decode(string, 0);
                            arrayList.add(ix7VarA.j());
                            break;
                        }
                        cursorRawQuery.close();
                        sQLiteDatabaseA2.setTransactionSuccessful();
                        sQLiteDatabaseA2.endTransaction();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((haa0) cik1Var.d).s((s29) it.next(), 1, false);
                        }
                        return null;
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    sQLiteDatabaseA2.endTransaction();
                    throw th2;
                }
        }
    }

    public Object d(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    public void e(long j, izr0 izr0Var) {
        ijo1.r(j, izr0Var, ((gt51) this.b).c);
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        uww0 uww0Var = (uww0) this.b;
        switch (b) {
            case 3:
                kii1 kii1Var = (kii1) zf30Var;
                lii1 lii1Var = (lii1) ((ynb0) uww0Var.b).get();
                lii1Var.getClass();
                kii1Var.getClass();
                f0a f0aVar = new f0a(lii1Var, kii1Var);
                kii1Var.G1 = new bte1((xse1) ((jly0) f0aVar.e).get());
                lzn0 lzn0Var = (lzn0) lii1Var.f.get();
                c8o.l(lzn0Var);
                kii1Var.H1 = new sun0(lzn0Var);
                kii1Var.I1 = (iii1) ((jly0) f0aVar.f).get();
                i8h1 i8h1Var = (i8h1) lii1Var.i.get();
                c8o.l(i8h1Var);
                kii1Var.J1 = i8h1Var;
                l6h1 l6h1Var = (l6h1) lii1Var.j.get();
                c8o.l(l6h1Var);
                kii1Var.K1 = l6h1Var;
                kii1Var.L1 = (fhi1) ((jly0) f0aVar.g).get();
                kii1Var.M1 = (ytq) ((jly0) f0aVar.h).get();
                kii1Var.N1 = (ztq) ((jly0) f0aVar.Q0).get();
                kii1Var.O1 = ((Boolean) lii1Var.s.get()).booleanValue();
                break;
            default:
                c5l1 c5l1Var = (c5l1) zf30Var;
                d5l1 d5l1Var = (d5l1) ((ynb0) uww0Var.b).get();
                d5l1Var.getClass();
                c5l1Var.getClass();
                kg0 kg0Var = (kg0) d5l1Var.b.get();
                c8o.l(kg0Var);
                c5l1Var.G1 = kg0Var;
                tac0 tac0Var = ((zf30) c5l1Var).s1;
                fmy0 fmy0Var = (fmy0) d5l1Var.c.get();
                c8o.l(fmy0Var);
                ecl eclVar = (ecl) d5l1Var.d.get();
                c8o.l(eclVar);
                Scheduler scheduler = (Scheduler) d5l1Var.g.get();
                c8o.l(scheduler);
                caq caqVar = d5l1Var.f;
                Scheduler scheduler2 = (Scheduler) caqVar.get();
                c8o.l(scheduler2);
                Observable observable = (Observable) d5l1Var.e.get();
                c8o.l(observable);
                dwe0 dwe0Var = (dwe0) d5l1Var.j.get();
                c8o.l(dwe0Var);
                boolean zBooleanValue = ((Boolean) c5l1Var.Q1.getValue()).booleanValue();
                juk jukVar = (juk) d5l1Var.h.get();
                c8o.l(jukVar);
                c5l1Var.H1 = new h5l1(tac0Var, fmy0Var, eclVar, scheduler, scheduler2, c5l1Var, observable, dwe0Var, zBooleanValue, jukVar);
                c8o.l((lg0) d5l1Var.a.get());
                c8o.l((g1f0) d5l1Var.i.get());
                Scheduler scheduler3 = (Scheduler) caqVar.get();
                c8o.l(scheduler3);
                c5l1Var.I1 = scheduler3;
                y0g y0gVar = (y0g) d5l1Var.k.get();
                c8o.l(y0gVar);
                c5l1Var.J1 = y0gVar;
                a1g a1gVar = (a1g) d5l1Var.l.get();
                c8o.l(a1gVar);
                c5l1Var.K1 = a1gVar;
                feh1 feh1Var = (feh1) d5l1Var.m.get();
                c8o.l(feh1Var);
                c5l1Var.L1 = feh1Var;
                mbo0 mbo0Var = (mbo0) d5l1Var.n.get();
                c8o.l(mbo0Var);
                c5l1Var.M1 = mbo0Var;
                p3n1 p3n1Var = (p3n1) d5l1Var.o.get();
                c8o.l(p3n1Var);
                c5l1Var.N1 = p3n1Var;
                x2g1 x2g1Var = (x2g1) d5l1Var.p.get();
                c8o.l(x2g1Var);
                c5l1Var.O1 = x2g1Var;
                break;
        }
    }

    public jku i(uk4 uk4Var) {
        View view = (View) this.b;
        if (view.hasOnClickListeners()) {
            eg.m("this View already has a click listener");
            return null;
        }
        view.setOnClickListener(new kpt(uk4Var, (byte) 6));
        return new dx30(view, (byte) 1);
    }

    public void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                ioo1.y((Intent) obj);
                break;
            case 16:
                ((jvl1) obj).b.d((Object) null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }
}
