package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wo60 {
    public final lxg a;
    public final String b;
    public uo60 c;
    public final LinkedHashMap d;
    public kj41 e;
    public nif1 f;
    public wma1 g;
    public wma1 h;
    public wma1 i;

    public wo60(lxg lxgVar) {
        hhp0 hhp0Var = hhp0.a;
        this.a = lxgVar;
        this.b = "home";
        this.d = new LinkedHashMap();
    }

    public final synchronized void a() {
        this.d.clear();
        uo60 uo60Var = this.c;
        if (uo60Var != null) {
            e(uo60Var.a, 2, 1);
        }
    }

    public final synchronized void b() {
        try {
            kj41 kj41Var = this.e;
            if (kj41Var != null) {
                kj41Var.setAttribute("cancellation_reason", "owner_destroyed");
            }
            c(2, false);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(int i, boolean z) {
        wma1 wma1Var = this.g;
        if (wma1Var != null) {
            wma1Var.a((Long) null);
        }
        this.g = null;
        wma1 wma1Var2 = this.h;
        if (wma1Var2 != null) {
            wma1Var2.a((Long) null);
        }
        this.h = null;
        wma1 wma1Var3 = this.i;
        if (wma1Var3 != null) {
            wma1Var3.a((Long) null);
        }
        this.i = null;
        kj41 kj41Var = this.e;
        if (kj41Var != null) {
            kj41Var.setAttribute("outcome", kx40.e(i));
        }
        nif1 nif1Var = this.f;
        if (nif1Var != null) {
            nif1Var.stop();
        }
        this.f = null;
        kj41 kj41Var2 = this.e;
        if (z) {
            if (kj41Var2 != null) {
                kj41Var2.cancel();
            }
        } else if (kj41Var2 != null) {
            kj41Var2.stop();
        }
        this.e = null;
    }

    public final synchronized void d() {
        c(3, false);
    }

    public final void e(UUID uuid, int i, int i2) {
        String str;
        uo60 uo60Var = this.c;
        if (uo60Var == null) {
            return;
        }
        nif1 nif1Var = uo60Var.d;
        kj41 kj41Var = uo60Var.c;
        if (uo60Var.a.equals(uuid)) {
            this.c = null;
            Iterator it = uo60Var.i.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                vo60 vo60Var = (vo60) it.next();
                if (vo60Var.q == 0) {
                    vo60Var.a(i == 2 ? 4 : 3);
                }
            }
            wma1 wma1Var = uo60Var.f;
            if (wma1Var != null) {
                wma1Var.a((Long) null);
            }
            nif1 nif1Var2 = uo60Var.e;
            if (nif1Var2 != null) {
                nif1Var2.setAttribute("outcome", kx40.e(i));
            }
            nif1 nif1Var3 = uo60Var.e;
            if (nif1Var3 != null) {
                nif1Var3.stop();
            }
            nif1Var.setAttribute("outcome", kx40.e(i));
            nif1Var.setAttribute("completion_session_id", uo60Var.b);
            nif1Var.stop();
            kj41Var.setAttribute("outcome", kx40.e(i));
            kj41Var.setAttribute("completion_session_id", uo60Var.b);
            kj41Var.setAttribute("rendered_slot_count", String.valueOf(uo60Var.b()));
            kj41Var.setAttribute("failed_slot_count", String.valueOf(uo60Var.a()));
            if (i2 != 0) {
                if (i2 == 1) {
                    str = "navigation_away";
                } else if (i2 == 2) {
                    str = "superseded";
                } else if (i2 == 3) {
                    str = "owner_destroyed";
                } else {
                    if (i2 != 4) {
                        throw null;
                    }
                    str = "request_cancelled";
                }
                kj41Var.setAttribute("cancellation_reason", str);
            }
            kj41Var.stop();
        }
    }

    public final void f(UUID uuid) {
        int i;
        boolean z;
        boolean z2;
        uo60 uo60Var = this.c;
        if (uo60Var == null) {
            return;
        }
        UUID uuid2 = uo60Var.a;
        LinkedHashMap linkedHashMap = uo60Var.i;
        LinkedHashSet linkedHashSet = uo60Var.h;
        if (uuid2.equals(uuid)) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                i = 3;
                if (!it.hasNext()) {
                    break;
                }
                vo60 vo60Var = (vo60) linkedHashMap.get((String) it.next());
                if (vo60Var != null && vo60Var.l && vo60Var.d == null && vo60Var.e == null && ((z2 = vo60Var.m) || vo60Var.n)) {
                    if (vo60Var.q == 0) {
                        if (!vo60Var.n || z2) {
                            i = vo60Var.k == 0 ? 2 : 1;
                        }
                        vo60Var.a(i);
                    }
                }
            }
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (!linkedHashSet.isEmpty()) {
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    vo60 vo60Var2 = (vo60) linkedHashMap.get((String) it2.next());
                    if (vo60Var2 == null || vo60Var2.q == 0) {
                        return;
                    }
                }
            }
            if (linkedHashSet.isEmpty()) {
                z = true;
            } else {
                Iterator it3 = linkedHashSet.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        vo60 vo60Var3 = (vo60) linkedHashMap.get((String) it3.next());
                        if (vo60Var3 == null || !vo60Var3.n || vo60Var3.m) {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                }
            }
            if (!linkedHashSet.isEmpty()) {
                Iterator it4 = linkedHashSet.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i = 2;
                        break;
                    }
                    vo60 vo60Var4 = (vo60) linkedHashMap.get((String) it4.next());
                    if ((vo60Var4 != null ? vo60Var4.q : 0) != 4) {
                        if (!z) {
                            i = 1;
                            break;
                        }
                        break;
                    }
                }
            } else {
                i = 2;
                break;
            }
            hhp0.a.t("page.home.slot_loading", "all_slots_terminal", sqg0.J(new mmr0[]{new mmr0("load_id", uuid2.toString()), new mmr0("slot_count", String.valueOf(linkedHashSet.size())), new mmr0("rendered_slot_count", String.valueOf(uo60Var.b())), new mmr0("failed_slot_count", String.valueOf(uo60Var.a())), new mmr0("outcome", kx40.e(i))}));
            e(uuid, i, i != 2 ? 0 : 2);
        }
    }

    public final synchronized void g(UUID uuid) {
        try {
            uo60 uo60Var = this.c;
            if (uo60Var == null) {
                return;
            }
            if (uo60Var.a.equals(uuid)) {
                wma1 wma1Var = uo60Var.f;
                if (wma1Var != null) {
                    wma1Var.a((Long) null);
                }
                nif1 nif1Var = uo60Var.e;
                if (nif1Var != null) {
                    nif1Var.setAttribute("outcome", "failure");
                }
                nif1 nif1Var2 = uo60Var.e;
                if (nif1Var2 != null) {
                    nif1Var2.stop();
                }
                uo60Var.f = null;
                uo60Var.e = null;
                e(uuid, 3, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Integer h(UUID uuid, ArrayList arrayList, String str) {
        try {
            uo60 uo60Var = this.c;
            if (uo60Var == null) {
                return null;
            }
            if (!uo60Var.a.equals(uuid)) {
                return null;
            }
            wma1 wma1Var = uo60Var.f;
            if (wma1Var != null) {
                wma1Var.a((Long) null);
            }
            uo60Var.f = null;
            nif1 nif1Var = uo60Var.e;
            if (nif1Var != null) {
                nif1Var.setAttribute("load_source", str);
            }
            nif1 nif1Var2 = uo60Var.e;
            if (nif1Var2 != null) {
                nif1Var2.setAttribute("outcome", "success");
            }
            nif1 nif1Var3 = uo60Var.e;
            if (nif1Var3 != null) {
                nif1Var3.stop();
            }
            uo60Var.e = null;
            int i = uo60Var.g + 1;
            uo60Var.g = i;
            Iterator it = uo60Var.i.values().iterator();
            while (it.hasNext()) {
                ((vo60) it.next()).a(5);
            }
            uo60Var.i.clear();
            uo60Var.h.clear();
            uo60Var.h.addAll(arrayList);
            uo60Var.d.setAttribute("layout_source", str);
            uo60Var.d.setAttribute("slot_count", String.valueOf(arrayList.size()));
            if (arrayList.isEmpty()) {
                e(uuid, 1, 0);
            }
            return Integer.valueOf(i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i() {
        try {
            wma1 wma1Var = this.h;
            if (wma1Var != null) {
                wma1Var.a((Long) null);
            }
            this.h = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        try {
            wma1 wma1Var = this.h;
            if (wma1Var != null) {
                wma1Var.a((Long) null);
            }
            nif1 nif1Var = this.f;
            this.h = nif1Var != null ? nif1Var.c((Long) null, "content_creation") : null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k() {
        try {
            wma1 wma1Var = this.g;
            if (wma1Var != null) {
                wma1Var.a((Long) null);
            }
            this.g = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void l() {
        try {
            nif1 nif1Var = this.f;
            this.g = nif1Var != null ? nif1Var.c((Long) null, "loadable_resource") : null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m() {
        try {
            wma1 wma1Var = this.i;
            if (wma1Var != null) {
                wma1Var.a((Long) null);
            }
            nif1 nif1Var = this.f;
            this.i = nif1Var != null ? nif1Var.c((Long) null, "render") : null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n() {
        kj41 kj41Var = this.e;
        if (kj41Var != null) {
            kj41Var.setAttribute("loading_mode", "legacy");
        }
    }

    public final synchronized void o(String str, UUID uuid) {
        uo60 uo60Var = this.c;
        if (uo60Var == null) {
            return;
        }
        if (uo60Var.a.equals(uuid)) {
            vo60 vo60Var = (vo60) uo60Var.i.get(str);
            if (vo60Var == null) {
                return;
            }
            vo60Var.a(4);
            f(uuid);
        }
    }

    public final synchronized void p(String str, UUID uuid) {
        try {
            uo60 uo60Var = this.c;
            if (uo60Var == null) {
                return;
            }
            if (uo60Var.a.equals(uuid)) {
                vo60 vo60Var = (vo60) uo60Var.i.get(str);
                if (vo60Var == null) {
                    return;
                }
                vo60Var.b();
                vo60Var.n = true;
                vo60Var.o++;
                if (vo60Var.g > 0) {
                    vo60Var.h = 2;
                }
                f(uuid);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void q(String str, UUID uuid) {
        uo60 uo60Var = this.c;
        if (uo60Var == null) {
            return;
        }
        if (uo60Var.a.equals(uuid)) {
            vo60 vo60Var = (vo60) uo60Var.i.get(str);
            if (vo60Var == null) {
                return;
            }
            vo60Var.l = true;
            f(uuid);
        }
    }

    public final synchronized void r(String str, UUID uuid, String str2, int i, int i2) {
        Integer num;
        try {
            uo60 uo60Var = this.c;
            if (uo60Var == null) {
                return;
            }
            if (uo60Var.a.equals(uuid)) {
                vo60 vo60Var = (vo60) uo60Var.i.get(str);
                if (vo60Var == null) {
                    return;
                }
                vo60Var.b();
                vo60Var.b.setAttribute("load_source", str2);
                vo60Var.b.setAttribute("section_count", String.valueOf(i));
                if (vo60Var.i == null) {
                    vo60Var.i = str2;
                    vo60Var.b.setAttribute("first_response_source", str2);
                }
                boolean z = true;
                vo60Var.j++;
                vo60Var.m = true;
                vo60Var.k = i;
                if (vo60Var.g > 0) {
                    vo60Var.h = 1;
                }
                if (i <= 0 || ((num = (Integer) this.d.get(str)) != null && num.intValue() == i2)) {
                    z = false;
                }
                wma1 wma1Var = vo60Var.e;
                if (wma1Var != null) {
                    wma1Var.a((Long) null);
                }
                vo60Var.e = z ? vo60Var.b.c((Long) null, "content_to_render") : null;
                vo60Var.f = z ? Integer.valueOf(i2) : null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
