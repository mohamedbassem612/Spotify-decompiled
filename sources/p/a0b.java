package p;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.InputStream;
import java.net.ServerSocket;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a0b implements n8n, Function, SingleOnSubscribe, jrn0, s8y, av30, c290, ya, BiFunction, v891, wae1, dsn {
    public final /* synthetic */ byte a;

    public a0b(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.a = (byte) 12;
    }

    public static final InputStream d(String str) {
        return Runtime.getRuntime().exec(new String[]{"getprop", str}).getInputStream();
    }

    public static yo00 e(Context context, f6b1 f6b1Var, exs exsVar, ajr ajrVar, u4b1 u4b1Var, Looper looper) {
        bo00 bo00Var = new bo00(context, f6b1Var);
        dm5.y(!bo00Var.A);
        dm5.m(ajrVar != o4a.l);
        bo00Var.g = new x7s(ajrVar, (byte) 3);
        bo00Var.c(exsVar);
        bo00Var.b(u4b1Var);
        dm5.y(!bo00Var.A);
        bo00Var.i = looper;
        return bo00Var.a();
    }

    public static doc f(y570 y570Var) {
        sc70 sc70Var = (j570) y570Var.j().get("click");
        return new doc(sc70Var != null ? sc70Var.b.b : null, sc70Var != null ? sc70Var.b.c.B("uri") : null, sc70Var != null ? sc70Var.b.c.B("checkout_source") : null);
    }

    public static ArrayList g(u310 u310Var) {
        ArrayList arrayList = new ArrayList();
        Uri uri = u310Var.h;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        if (!u890.j(uri, Uri.EMPTY)) {
            uri.getClass();
            pyp0 pyp0Var = new pyp0((byte) 6);
            pyp0Var.d = uri;
            pyp0Var.b = 320;
            pyp0Var.c = 320;
            arrayList.add(new fq70(pyp0Var));
        }
        return arrayList;
    }

    public float a(StringBuilder sb) {
        return 0.0f;
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0014 A[SYNTHETIC] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return k4h.c((Throwable) obj);
            case 14:
                return vva0.b.get(obj);
            case 16:
                return pli0.b.get(obj);
            default:
                mvv0 mvv0Var = (mvv0) obj;
                List<ktv0> list = mvv0Var.b;
                ArrayList arrayList = new ArrayList();
                for (ktv0 ktv0VarA : list) {
                    ktv0 etv0Var = null;
                    switch (l1d.C(((ayq0) ktv0VarA).a)) {
                        case 0:
                        case 1:
                        case 2:
                            ktv0VarA = etv0Var;
                            if (ktv0VarA != null) {
                                arrayList.add(ktv0VarA);
                            }
                            break;
                        case 3:
                            etv0 etv0Var2 = (etv0) ktv0VarA;
                            String string = etv0Var2.b;
                            if (string != null) {
                                string = Html.fromHtml(string, 63).toString();
                            }
                            etv0Var = new etv0(string, etv0Var2.c, etv0Var2.d, etv0Var2.e, etv0Var2.f);
                            ktv0VarA = etv0Var;
                            if (ktv0VarA != null) {
                                arrayList.add(ktv0VarA);
                            }
                            break;
                        case 4:
                        case 5:
                        case 8:
                            if (ktv0VarA != null) {
                                arrayList.add(ktv0VarA);
                            }
                            break;
                        case 6:
                            ktv0VarA = lk1.a(ktv0VarA);
                            if (ktv0VarA != null) {
                                arrayList.add(ktv0VarA);
                            }
                            break;
                        case 7:
                            aq50 aq50Var = (aq50) ktv0VarA;
                            List list2 = aq50Var.e;
                            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(lk1.a((ktv0) it.next()));
                            }
                            ktv0VarA = new aq50(aq50Var.b, aq50Var.c, aq50Var.d, arrayList2);
                            if (ktv0VarA != null) {
                                arrayList.add(ktv0VarA);
                            }
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                }
                return new mvv0(mvv0Var.a, arrayList);
        }
    }

    public Object b(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    public boolean c(int i) {
        return i == 1;
    }

    public Object convert(int i) {
        oln0 oln0VarA = oln0.a(i);
        return oln0VarA == null ? oln0.FALLBACK_REASONS_LOW_DISTRACTION : oln0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v6 java.lang.Object, still in use, count: 2, list:
          (r3v6 java.lang.Object) from 0x0049: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v6 java.lang.Object) binds: [B:19:0x0048, B:48:0x0049] A[DONT_GENERATE, DONT_INLINE]
          (r3v6 java.lang.Object) from 0x003b: CHECK_CAST (p.swd1) (r3v6 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public p.irn0 l(android.content.Intent r9, p.th61 r10) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a0b.l(android.content.Intent, p.th61):p.irn0");
    }

    public void subscribe(SingleEmitter singleEmitter) {
        ServerSocket serverSocket = new ServerSocket(0);
        if (serverSocket.getLocalPort() == -1) {
            singleEmitter.onError(new IllegalStateException("Couldn't create socket"));
        } else {
            singleEmitter.onSuccess(serverSocket);
        }
        singleEmitter.setCancellable(new ci0(serverSocket, (byte) 1));
    }

    public String toString() {
        switch (this.a) {
            case 29:
                int iHashCode = hashCode();
                eth.h(16);
                return cy30.p("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", rc11.a.b(Application.class).r(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a0b(byte b) {
        this.a = b;
    }

    public Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        List listA1 = o7h.a1((List) obj2, new ktg0((byte) 28));
        Set setO1 = o7h.o1(listA1);
        ArrayList arrayList = new ArrayList(q7h.U(setO1, 10));
        Iterator it = setO1.iterator();
        while (it.hasNext()) {
            arrayList.add(((kjf1) it.next()).a);
        }
        int size = listA1.size();
        Object[] objArr = new kjf1[size];
        int iMin = Math.min(list.size(), listA1.size());
        int i = 0;
        for (int i2 = 0; i2 < iMin; i2++) {
            kjf1 kjf1Var = (kjf1) list.get(i2);
            if (arrayList.contains(kjf1Var.a)) {
                objArr[i2] = kjf1Var;
                setO1.remove(kjf1Var);
            }
        }
        List listL1 = o7h.l1(setO1);
        int i3 = 0;
        int i4 = 0;
        while (i < size) {
            int i5 = i3 + 1;
            if (objArr[i] == null) {
                objArr[i3] = listL1.get(i4);
                i4++;
            }
            i++;
            i3 = i5;
        }
        List<kjf1> listQ0 = f46.Q0(objArr);
        ArrayList arrayList2 = new ArrayList();
        for (kjf1 kjf1Var2 : listQ0) {
            if (kjf1Var2 != null) {
                arrayList2.add(kjf1Var2);
            }
        }
        return arrayList2;
    }
}
