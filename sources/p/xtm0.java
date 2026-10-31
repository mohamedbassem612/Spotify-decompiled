package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xtm0 {
    public final pe a;
    public final boolean b;
    public final a9l1 c;
    public zau0 d;
    public r091 e;
    public VideoSurfaceView f;
    public final String g = UUID.randomUUID().toString();
    public final bpb1 h;
    public final jge i;

    public xtm0(pe peVar, boolean z, a9l1 a9l1Var) {
        this.a = peVar;
        this.b = z;
        this.c = a9l1Var;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.h = bpb1VarB;
        this.i = hu20.e(bpb1VarB, new i64((byte) 16));
    }

    public final void a(zau0 zau0Var, sqj1 sqj1Var, yjp1 yjp1Var) {
        ljj1 ljj1VarC;
        String strN;
        bpb1 bpb1Var;
        r091 r091Var;
        if (!zau0Var.equals(this.d)) {
            c();
        }
        this.d = zau0Var;
        if (!sqj1Var.a() || (ljj1VarC = sqj1Var.c()) == null || !ljj1VarC.c() || !this.a.b(4) || this.b) {
            c();
            return;
        }
        zau0 zau0Var2 = this.d;
        a9l1 a9l1Var = this.c;
        if (zau0Var2 != null) {
            if (((Boolean) zau0Var2.b.getValue()).booleanValue()) {
                r091 r091Var2 = this.e;
                if (r091Var2 == null || ((Boolean) r091Var2.e.a().getValue()).booleanValue()) {
                    LinkedList linkedList = a9l1Var.a;
                    linkedList.removeIf(z8l1.b);
                    while (zau0Var2.b() == 0 && !linkedList.isEmpty()) {
                        WeakReference weakReference = (WeakReference) linkedList.poll();
                        if (weakReference != null && (r091Var = (r091) weakReference.get()) != null) {
                            r091Var.g();
                        }
                    }
                    r091 r091VarA = zau0Var2.a();
                    if (r091VarA != null) {
                        linkedList.add(new WeakReference(r091VarA));
                    } else {
                        r091VarA = null;
                    }
                    this.e = r091VarA;
                }
                r091 r091Var3 = this.e;
                if (r091Var3 != null) {
                    r091Var3.i(this.f);
                }
            }
            r091 r091Var4 = this.e;
            this.h.l((r091Var4 == null || (bpb1Var = r091Var4.g) == null) ? null : new r6k0(bpb1Var, (byte) 6));
        }
        r091 r091Var5 = this.e;
        if (r091Var5 != null) {
            ksm0 ksm0Var = new ksm0(fec1.c, (String) null, (String) null, sqj1Var.b(), "", (String) null, 486);
            jjj1 jjj1VarC = sqj1Var.c();
            if (jjj1VarC == null) {
                hhg1.n("Required value was null.");
                return;
            }
            jsm0 jsm0Var = new jsm0(Long.valueOf(jjj1VarC.b()), Long.valueOf(jjj1VarC.a()));
            if (jjj1VarC instanceof jjj1) {
                strN = jjj1VarC.d();
            } else {
                if (!(jjj1VarC instanceof kjj1)) {
                    eg.o();
                    return;
                }
                strN = wqn1.n(((kjj1) jjj1VarC).a);
            }
            r091Var5.b(new lsm0(strN, ksm0Var, true, false, jsm0Var, 0L, (ism0) null, this.g, false, 0, 1888));
            r091.f(r091Var5, null, null, yjp1Var, 7);
            LinkedList linkedList2 = a9l1Var.a;
            Iterator it = linkedList2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (u890.j(((WeakReference) it.next()).get(), r091Var5)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1 || i == p7h.L(linkedList2)) {
                return;
            }
            linkedList2.add((WeakReference) linkedList2.remove(i));
        }
    }

    public final void b() {
        r091 r091Var = this.e;
        if (r091Var != null) {
            r091Var.d();
            LinkedList linkedList = this.c.a;
            Iterator it = linkedList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (u890.j(((WeakReference) it.next()).get(), r091Var)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i > 0) {
                linkedList.addFirst((WeakReference) linkedList.remove(i));
            }
        }
    }

    public final void c() {
        r091 r091Var = this.e;
        if (r091Var != null) {
            r091Var.g();
        }
        this.e = null;
        this.h.l(null);
    }
}
