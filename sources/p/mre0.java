package p;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mre0 implements Function, u7u, ird1, qiw, Producer {
    public final /* synthetic */ byte a;
    public final Object b;

    public mre0(y5v0 y5v0Var, iac0 iac0Var) {
        this.a = (byte) 0;
        this.b = y5v0Var;
        iac0Var.getLifecycle().a(new ct6(this, (byte) 8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void a(ywm0 ywm0Var, onm onmVar) {
        qjp0 qjp0Var;
        if (onmVar instanceof qjp0) {
            qjp0Var = (qjp0) onmVar;
            int i = qjp0Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                qjp0Var.c = i - os00.INVALID_ID;
            } else {
                qjp0Var = new qjp0(this, onmVar);
            }
        } else {
            qjp0Var = new qjp0(this, onmVar);
        }
        Object obj = qjp0Var.a;
        int i2 = qjp0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
        } else {
            hm5.M(obj);
            bpb1 bpb1Var = (bpb1) this.b;
            qjp0Var.c = 1;
            bpb1Var.collect(ywm0Var, qjp0Var);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v18 java.lang.Object, still in use, count: 2, list:
          (r2v18 java.lang.Object) from 0x011d: PHI (r2 I:??) = (r2v15 java.lang.Object), (r2v18 java.lang.Object) binds: [B:39:0x011c, B:91:0x011d] A[DONT_GENERATE, DONT_INLINE]
          (r2v18 java.lang.Object) from 0x010f: CHECK_CAST (p.u310) (r2v18 java.lang.Object)
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
    public java.lang.Object apply(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mre0.apply(java.lang.Object):java.lang.Object");
    }

    public void b() {
        Consumer consumer = (Consumer) ((s59) this.b).b;
        if (consumer != null) {
            consumer.accept(vjg0.a);
        }
    }

    public nar0 c() {
        bn70 bn70VarA = ((bbr0) this.b).b0(bn70.class).a();
        if (bn70VarA != null) {
            return bn70VarA.c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    public String d(hll hllVar, zoy0 zoy0Var, iix0 iix0Var, int i) {
        long j;
        long j2;
        Date date;
        long j3;
        long jU = hllVar != null ? jfv.u(hllVar.a, ngv.e) : 0L;
        boolean z = false;
        boolean z2 = i == 5;
        boolean z3 = i == 4 || z2;
        if (!z3 && (zoy0Var == null || zoy0Var.c <= 0)) {
            return "";
        }
        if (iix0Var instanceof gix0) {
            gix0 gix0Var = (gix0) iix0Var;
            j = 1000;
            j2 = (gix0Var.b - gix0Var.c) / 1000;
        } else {
            j = 1000;
            j2 = jU;
        }
        if (zoy0Var != null) {
            long j4 = zoy0Var.c;
            if (j4 > 0) {
                date = new Date(j4 * j);
            } else {
                date = new Date(0L);
            }
        } else {
            date = new Date(0L);
        }
        if (iix0Var == null || !iix0Var.g()) {
            j3 = jU;
        } else {
            j3 = jU;
            z = true;
        }
        return ((zwg) this.b).L(new m4v0(j3, j2, z, date, false, z3, z2, false, null, iix0Var, i, null, 2448));
    }

    public void e(Set set) {
        Object value;
        int[] iArr;
        if (set.isEmpty()) {
            return;
        }
        bpb1 bpb1Var = (bpb1) this.b;
        do {
            value = bpb1Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = set.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
        } while (!bpb1Var.k(value, iArr));
    }

    public g5l0 f(String str) {
        return new g5l0(str, (r6h1) this.b, (byte) 8);
    }

    public void g(String str, Bitmap bitmap) {
        y36 y36Var = MediaMetadataCompat.c;
        if (!y36Var.containsKey(str) || ((Integer) y36Var.get(str)).intValue() == 2) {
            ((Bundle) this.b).putParcelable(str, bitmap);
        } else {
            hhg1.n(f4i1.f("The ", str, " key cannot be used to put a Bitmap"));
        }
    }

    public Object get() {
        return new SchedulerWorkRunner(((n9m0) this.b).b);
    }

    public void h(long j, String str) {
        y36 y36Var = MediaMetadataCompat.c;
        if (!y36Var.containsKey(str) || ((Integer) y36Var.get(str)).intValue() == 0) {
            ((Bundle) this.b).putLong(str, j);
        } else {
            hhg1.n(f4i1.f("The ", str, " key cannot be used to put a long"));
        }
    }

    public void i(String str, String str2) {
        y36 y36Var = MediaMetadataCompat.c;
        if (!y36Var.containsKey(str) || ((Integer) y36Var.get(str)).intValue() == 1) {
            ((Bundle) this.b).putCharSequence(str, str2);
        } else {
            hhg1.n(f4i1.f("The ", str, " key cannot be used to put a String"));
        }
    }

    public void o(Exception exc) {
        ivg0 ivg0VarZ0 = ((mwg0) this.b).Z0();
        ao0.c(ivg0VarZ0.e, co0.i, ivg0VarZ0.a.a, (Long) null, (String) null, (String) null, (String) null, (String) null, 124);
        mwg0 mwg0Var = ivg0VarZ0.n;
        if (mwg0Var != null) {
            mwg0Var.a1(new evg0(ivg0VarZ0, (byte) 0));
        } else {
            u890.C("viewBinder");
            throw null;
        }
    }

    public void onSuccess() {
        ivg0 ivg0VarZ0 = ((mwg0) this.b).Z0();
        iug0 iug0Var = ivg0VarZ0.a;
        if (ivg0VarZ0.o) {
            return;
        }
        cyg0 cyg0Var = ivg0VarZ0.g;
        cyg0Var.a.f(cyg0Var.a(iug0Var.a).e(), (Set) null);
        ao0.c(ivg0VarZ0.e, co0.Z, iug0Var.a, (Long) null, (String) null, (String) null, (String) null, (String) null, 124);
        ivg0VarZ0.o = true;
    }

    public void v(Object obj) {
        EditText editText;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 10:
                int i = MessageInputView.X0;
                ((EditText) ((MessageInputView) obj2).T0.b).setHint(((ak80) obj).a.a);
                return;
            case 17:
                azo0 azo0Var = ((qzo0) ((u3) obj2).f).c;
                int iOrdinal = ((hzo0) obj).ordinal();
                if (iOrdinal == 0) {
                    if (azo0Var.g != 1) {
                        azo0Var.g = 1;
                        azo0Var.h();
                        return;
                    }
                    return;
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return;
                } else {
                    if (azo0Var.g != 2) {
                        azo0Var.g = 2;
                        azo0Var.h();
                        return;
                    }
                    return;
                }
            case 18:
                ((j2p0) obj2).h(((Boolean) obj).booleanValue());
                return;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                b14 b14Var = (b14) obj2;
                Iterator it = ((List) b14Var.e).iterator();
                while (it.hasNext()) {
                    ((EditText) it.next()).setEnabled(zBooleanValue);
                }
                if (zBooleanValue) {
                    ViewGroup viewGroup = (ViewGroup) ((View) b14Var.c);
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    while (i2 < viewGroup.getChildCount()) {
                        int i3 = i2 + 1;
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt == null) {
                            tw20.p();
                            return;
                        } else {
                            if (childAt instanceof EditText) {
                                arrayList.add(childAt);
                            }
                            i2 = i3;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    int i4 = 0;
                    while (true) {
                        editText = null;
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                p7h.T();
                                throw null;
                            }
                            editText = (EditText) next;
                            Editable text = editText.getText();
                            if (text != null && text.length() != 0) {
                                i4 = i5;
                            }
                        }
                    }
                    if (editText != null) {
                        if (!editText.isAttachedToWindow()) {
                            editText.addOnAttachStateChangeListener(new c9s(editText, editText, (byte) 13));
                            return;
                        }
                        editText.requestFocus();
                        if (!editText.hasWindowFocus()) {
                            editText.getViewTreeObserver().addOnWindowFocusChangeListener(new zqi1(editText, (byte) 0));
                            return;
                        } else {
                            if (editText.isFocused()) {
                                editText.post(new seg1(editText, (byte) 2));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public mre0(bgw bgwVar, hbs0 hbs0Var) {
        this.a = (byte) 27;
        this.b = bgwVar;
    }

    public /* synthetic */ mre0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public mre0(int i) {
        this.a = (byte) 21;
        this.b = gio1.b(new int[i]);
    }

    public mre0() {
        this.a = (byte) 7;
        this.b = new Bundle();
    }

    public mre0(MediaMetadataCompat mediaMetadataCompat) {
        this.a = (byte) 7;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        eyh0.b(bundle);
    }
}
