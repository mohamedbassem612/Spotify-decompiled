package p;

import android.app.Activity;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iq60 implements tp60 {
    public final zle1 a;
    public final lxg b;
    public final tif1 c;
    public final w25 d;
    public t45 e;
    public gq60 g;
    public eq60 h;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final LinkedHashSet i = new LinkedHashSet();

    public iq60(zle1 zle1Var, lxg lxgVar, tif1 tif1Var, w25 w25Var) {
        this.a = zle1Var;
        this.b = lxgVar;
        this.c = tif1Var;
        this.d = w25Var;
    }

    public static String u(cq60 cq60Var, String str) {
        if (cq60Var instanceof vp60) {
            return "home_version";
        }
        if (cq60Var instanceof up60) {
            return "data_source";
        }
        if (cq60Var instanceof zp60) {
            return "page_identifier";
        }
        if (cq60Var instanceof wp60) {
            return "is_state_restore";
        }
        if (cq60Var instanceof yp60) {
            return "loading_mode";
        }
        if (cq60Var instanceof xp60) {
            return "layout_load_source";
        }
        if (cq60Var instanceof aq60) {
            return str != null ? str.concat("_source") : "response_mapping_source";
        }
        if (cq60Var instanceof bq60) {
            return str != null ? str.concat("_source") : kx40.k(((bq60) cq60Var).a()).toLowerCase(Locale.ROOT).concat("_load_source");
        }
        eg.o();
        return null;
    }

    public static String x(cq60 cq60Var) {
        if (cq60Var instanceof vp60) {
            return ((vp60) cq60Var).a;
        }
        if (cq60Var instanceof up60) {
            int iC = l1d.C(((up60) cq60Var).a);
            if (iC == 0) {
                return "cache";
            }
            if (iC == 1) {
                return "network";
            }
            eg.o();
            return null;
        }
        if (cq60Var instanceof zp60) {
            return ((zp60) cq60Var).a;
        }
        if (cq60Var instanceof wp60) {
            return String.valueOf(((wp60) cq60Var).a);
        }
        if (cq60Var instanceof yp60) {
            int iC2 = l1d.C(((yp60) cq60Var).a());
            if (iC2 == 0) {
                return "slot_based";
            }
            if (iC2 == 1) {
                return "legacy";
            }
            eg.o();
            return null;
        }
        if (cq60Var instanceof xp60) {
            return kx40.j(((xp60) cq60Var).a()).toLowerCase(Locale.ROOT);
        }
        if (cq60Var instanceof aq60) {
            return kx40.j(((aq60) cq60Var).a()).toLowerCase(Locale.ROOT);
        }
        if (cq60Var instanceof bq60) {
            return kx40.j(((bq60) cq60Var).b()).toLowerCase(Locale.ROOT);
        }
        eg.o();
        return null;
    }

    public static String y(kq60 kq60Var) {
        switch (kq60Var.ordinal()) {
            case 0:
                return "first_content_structure_to_first_draw";
            case 1:
                return "first_content_structure_to_view_data";
            case 2:
                return "first_content_view_data_to_submit_start";
            case 3:
                return "first_content_submit_start_to_submit_end";
            case 4:
                return "first_content_submit_end_to_first_draw";
            case 5:
                return "create_page_runtime";
            case 6:
                return "page_runtime_to_loadable_resource_start";
            case 7:
                return "create_page_content";
            case 8:
                return "load_data";
            case 9:
                return "load_data_fetch_home";
            case 10:
                return "load_data_repository";
            case 11:
                return "load_data_recently_played";
            case 12:
                return "load_data_response_mapping";
            case 13:
                return "load_data_response_metadata_mapping";
            case 14:
                return "create_list_content";
            case 15:
                return "render_list_content";
            case 16:
                return "mobius_got_home_structure";
            case 17:
                return "mobius_consumption_state_changed";
            case 18:
                return "loadable_resource_on_start";
            case 19:
                return "load_layout";
            case 20:
                return "load_slot_shortcut";
            case 21:
                return "load_slot_hero";
            case 22:
                return "load_slot_feed";
            case 23:
                return "load_slot_unknown";
            default:
                eg.o();
                return null;
        }
    }

    public final synchronized void a(dq60 dq60Var) {
        eq60 eq60VarW = w(dq60Var, 3);
        if (eq60VarW == null) {
            return;
        }
        eq60VarW.h(((s45) this.a).a.a());
        eq60VarW.g(4);
        kq60 kq60Var = kq60.d;
        kq60 kq60Var2 = kq60.e;
        t(y(kq60Var));
        v(y(kq60Var2));
    }

    public final synchronized void b(fq60 fq60Var, cq60 cq60Var) {
        if (fq60Var == null) {
            fq60Var = null;
        }
        if (fq60Var == null) {
            return;
        }
        t45 t45Var = this.e;
        if (t45Var == null) {
            return;
        }
        if (u890.j(t45Var.e, fq60Var.a())) {
            if (cq60Var != null) {
                try {
                    t45Var.a(u(cq60Var, fq60Var.b()), x(cq60Var));
                } catch (Exception unused) {
                }
            }
            try {
                t(fq60Var.b());
                this.i.remove(fq60Var);
            } catch (Exception unused2) {
            }
            try {
                t45Var.g(fq60Var.b());
            } catch (Exception unused3) {
            }
        }
    }

    public final synchronized void c() {
        try {
            t45 t45Var = this.e;
            if (t45Var == null) {
                return;
            }
            gq60 gq60Var = this.g;
            if (gq60Var == null) {
                return;
            }
            if (u890.j(gq60Var.a().a(), t45Var.e)) {
                gq60Var.e(Long.valueOf(((s45) this.a).a.a()));
                if (gq60Var.b() == null) {
                    v(y(kq60.g));
                } else {
                    q(gq60Var, t45Var);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized fq60 d(kq60 kq60Var) {
        String strY;
        try {
            t45 t45Var = this.e;
            fq60 fq60Var = null;
            if (t45Var == null) {
                return null;
            }
            switch (kq60Var.ordinal()) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 16:
                case 17:
                case 20:
                case 21:
                case 22:
                case 23:
                    String strY2 = y(kq60Var);
                    ConcurrentHashMap concurrentHashMap = this.f;
                    Object atomicInteger = concurrentHashMap.get(kq60Var);
                    if (atomicInteger == null) {
                        atomicInteger = new AtomicInteger(-1);
                        concurrentHashMap.put(kq60Var, atomicInteger);
                    }
                    strY = strY2 + "_" + ((AtomicInteger) atomicInteger).incrementAndGet();
                    break;
                case 14:
                case 15:
                case 18:
                case 19:
                default:
                    strY = y(kq60Var);
                    break;
            }
            try {
                t45Var.l(strY, null, (2 & 4) != 0);
                v(strY);
                fq60 fq60Var2 = new fq60(strY, t45Var.e);
                this.i.add(fq60Var2);
                fq60Var = fq60Var2;
            } catch (Exception unused) {
            }
            return fq60Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(hq60 hq60Var) {
        if (hq60Var == null) {
            hq60Var = null;
        }
        if (hq60Var == null) {
            return;
        }
        gq60 gq60Var = this.g;
        if (gq60Var == null) {
            return;
        }
        t45 t45Var = this.e;
        if (t45Var == null) {
            return;
        }
        if (gq60Var.a().equals(hq60Var) && u890.j(hq60Var.a(), t45Var.e)) {
            gq60Var.d(Long.valueOf(((s45) this.a).a.a()));
            if (gq60Var.c() != null) {
                q(gq60Var, t45Var);
            }
        }
    }

    public final synchronized boolean f(dq60 dq60Var) {
        eq60 eq60VarW = w(dq60Var, 2);
        if (eq60VarW == null) {
            return false;
        }
        eq60VarW.i(((s45) this.a).a.a());
        eq60VarW.g(3);
        kq60 kq60Var = kq60.c;
        kq60 kq60Var2 = kq60.d;
        t(y(kq60Var));
        v(y(kq60Var2));
        return true;
    }

    public final void g(kq60 kq60Var) {
        String strK;
        t45 t45Var = this.e;
        if (t45Var != null) {
            switch (kq60Var.ordinal()) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 16:
                case 17:
                case 20:
                case 21:
                case 22:
                case 23:
                    String strY = y(kq60Var);
                    ConcurrentHashMap concurrentHashMap = this.f;
                    Object atomicInteger = concurrentHashMap.get(kq60Var);
                    if (atomicInteger == null) {
                        atomicInteger = new AtomicInteger(-1);
                        concurrentHashMap.put(kq60Var, atomicInteger);
                    }
                    strK = l1d.k(((AtomicInteger) atomicInteger).incrementAndGet(), strY, "_");
                    break;
                case 14:
                case 15:
                case 18:
                case 19:
                default:
                    strK = y(kq60Var);
                    break;
            }
            t45Var.l(strK, null, (2 & 4) != 0);
            v(strK);
        }
    }

    public final synchronized dq60 h() {
        t45 t45Var = this.e;
        if (t45Var == null) {
            return null;
        }
        if (this.h != null) {
            return null;
        }
        dq60 dq60Var = new dq60(t45Var.e);
        this.h = new eq60(dq60Var, ((s45) this.a).a.a());
        v(y(kq60.a));
        v(y(kq60.b));
        return dq60Var;
    }

    public final void i(cq60 cq60Var) {
        t45 t45Var = this.e;
        if (t45Var != null) {
            t45Var.a(u(cq60Var, null), x(cq60Var));
        }
    }

    public final synchronized void j() {
        s();
        r();
        LinkedHashSet linkedHashSet = this.i;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            t(((fq60) it.next()).b());
        }
        linkedHashSet.clear();
        t45 t45VarA = ((s45) this.a).a("navigate_to_home_subfeed");
        t45VarA.l("navigate_to_home_subfeed", null, (2 & 4) != 0);
        t45VarA.a("part_of_cold_startup", String.valueOf(!(((i94) this.b).l != null)));
        this.e = t45VarA;
        v("navigate_to_home_subfeed");
        this.f.clear();
    }

    public final synchronized void k(dq60 dq60Var) {
        try {
            eq60 eq60VarW = w(dq60Var, 4);
            if (eq60VarW == null) {
                return;
            }
            long jA = ((s45) this.a).a.a();
            kq60 kq60Var = kq60.e;
            t(y(kq60Var));
            kq60 kq60Var2 = kq60.a;
            t(y(kq60Var2));
            t45 t45Var = this.e;
            if (t45Var != null) {
                t45.c(t45Var, y(kq60Var2), eq60VarW.c(), jA - eq60VarW.c(), 24);
                t45.c(t45Var, y(kq60.b), eq60VarW.c(), eq60VarW.f() - eq60VarW.c(), 24);
                t45.c(t45Var, y(kq60.c), eq60VarW.f(), eq60VarW.e() - eq60VarW.f(), 24);
                t45.c(t45Var, y(kq60.d), eq60VarW.e(), eq60VarW.d() - eq60VarW.e(), 24);
                t45.c(t45Var, y(kq60Var), eq60VarW.d(), jA - eq60VarW.d(), 24);
            }
            eq60VarW.g(5);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(nq60 nq60Var) {
        String str;
        String strA;
        t45 t45Var = this.e;
        if (t45Var != null) {
            boolean z = nq60Var instanceof lq60;
            if (z) {
                str = "is_offline";
            } else {
                if (!(nq60Var instanceof mq60)) {
                    eg.o();
                    return;
                }
                str = "session_id";
            }
            if (z) {
                strA = String.valueOf(((lq60) nq60Var).a());
            } else {
                if (!(nq60Var instanceof mq60)) {
                    eg.o();
                    return;
                }
                strA = ((mq60) nq60Var).a();
            }
            t45Var.b(str, strA);
        }
    }

    public final synchronized void m(int i, Activity activity) {
        String str;
        s();
        r();
        LinkedHashSet linkedHashSet = this.i;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            t(((fq60) it.next()).b());
        }
        linkedHashSet.clear();
        t("navigate_to_home_subfeed");
        t45 t45Var = this.e;
        if (t45Var != null) {
            t45Var.g("navigate_to_home_subfeed");
            int iC = l1d.C(i);
            if (iC == 0) {
                str = "succeeded";
            } else if (iC == 1) {
                str = "failed";
            } else {
                if (iC != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "cancelled";
            }
            t45Var.a("outcome", str);
            t45Var.b("preloaded_data", String.valueOf(this.d.j()));
            ((s45) this.a).b(t45Var.e());
            lxg lxgVar = this.b;
            if (!(((i94) lxgVar).l != null) && i == 1) {
                i94 i94Var = (i94) lxgVar;
                i94Var.a("navigate_to_home");
                i94Var.b("home_presented");
                try {
                    activity.reportFullyDrawn();
                } catch (SecurityException unused) {
                }
            }
        }
        this.e = null;
        this.f.clear();
    }

    public final synchronized void n(dq60 dq60Var) {
        eq60 eq60VarW = w(dq60Var, 1);
        if (eq60VarW == null) {
            return;
        }
        eq60VarW.j(((s45) this.a).a.a());
        eq60VarW.g(2);
        kq60 kq60Var = kq60.b;
        kq60 kq60Var2 = kq60.c;
        t(y(kq60Var));
        v(y(kq60Var2));
    }

    public final synchronized hq60 o() {
        t45 t45Var = this.e;
        if (t45Var == null) {
            return null;
        }
        s();
        hq60 hq60Var = new hq60(t45Var.e, UUID.randomUUID());
        this.g = new gq60(hq60Var);
        return hq60Var;
    }

    public final void p(kq60 kq60Var) {
        String strK;
        t45 t45Var = this.e;
        if (t45Var != null) {
            switch (kq60Var.ordinal()) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 16:
                case 17:
                case 20:
                case 21:
                case 22:
                case 23:
                    String strY = y(kq60Var);
                    AtomicInteger atomicInteger = (AtomicInteger) this.f.get(kq60Var);
                    strK = l1d.k(atomicInteger != null ? atomicInteger.get() : 0, strY, "_");
                    break;
                case 14:
                case 15:
                case 18:
                case 19:
                default:
                    strK = y(kq60Var);
                    break;
            }
            t(strK);
            t45Var.g(strK);
        }
    }

    public final void q(gq60 gq60Var, t45 t45Var) {
        Long lC = gq60Var.c();
        if (lC != null) {
            long jLongValue = lC.longValue();
            Long lB = gq60Var.b();
            if (lB != null) {
                long jLongValue2 = lB.longValue();
                if (jLongValue2 >= jLongValue) {
                    kq60 kq60Var = kq60.g;
                    t(y(kq60Var));
                    t45.c(t45Var, y(kq60Var), jLongValue, jLongValue2 - jLongValue, 24);
                }
                this.g = null;
            }
        }
    }

    public final void r() {
        eq60 eq60Var = this.h;
        if (eq60Var == null) {
            return;
        }
        int iC = l1d.C(eq60Var.b());
        if (iC == 0) {
            t(y(kq60.b));
        } else if (iC == 1) {
            t(y(kq60.c));
        } else if (iC == 2) {
            t(y(kq60.d));
        } else if (iC == 3) {
            t(y(kq60.e));
        } else if (iC != 4) {
            eg.o();
            return;
        }
        if (eq60Var.b() != 5) {
            t(y(kq60.a));
        }
        this.h = null;
    }

    public final void s() {
        gq60 gq60Var = this.g;
        if (gq60Var == null) {
            return;
        }
        if (gq60Var.c() != null && gq60Var.b() == null) {
            try {
                t(y(kq60.g));
            } catch (Throwable unused) {
            }
        }
        this.g = null;
    }

    public final void t(String str) {
        this.c.f(str, "nths");
    }

    public final void v(String str) {
        tif1.a(this.c, str, "nths", 4);
    }

    public final eq60 w(dq60 dq60Var, int i) {
        eq60 eq60Var;
        if (dq60Var == null) {
            dq60Var = null;
        }
        if (dq60Var != null && (eq60Var = this.h) != null && eq60Var.a().equals(dq60Var) && eq60Var.b() == i) {
            return eq60Var;
        }
        return null;
    }
}
