package p;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jg0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public jg0(fpo0 fpo0Var, gpo0 gpo0Var, boolean z, String str) {
        this.a = (byte) 2;
        this.c = fpo0Var;
        this.d = gpo0Var;
        this.b = z;
        this.e = str;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0187 A[Catch: ClassCastException -> 0x021d, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x021d, blocks: (B:52:0x0179, B:54:0x0187, B:84:0x0220, B:85:0x0235), top: B:88:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x018f  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x020f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0219  */
    /* JADX WARN: Code duplicated, block: B:84:0x0220 A[Catch: ClassCastException -> 0x021d, TRY_ENTER, TryCatch #0 {ClassCastException -> 0x021d, blocks: (B:52:0x0179, B:54:0x0187, B:84:0x0220, B:85:0x0235), top: B:88:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x0220, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean zA;
        kmt kmtVar;
        qkt qktVarA;
        Intent intent;
        er91 er91Var;
        er91 er91Var2;
        switch (this.a) {
            case 0:
                dkt dktVar = (dkt) this.e;
                kg0 kg0Var = (kg0) this.d;
                dg30 dg30Var = kg0Var.b;
                ifl1 ifl1Var = (ifl1) this.c;
                if (ifl1Var == null) {
                    ifl1Var = kg0.d;
                }
                ejb ejbVar = (ejb) ifl1Var.b;
                try {
                    if (!this.b) {
                        t2u t2uVarG = dg30Var.e0().G("zero_dialog_fragment");
                        if (t2uVarG != null) {
                            Logger.d("The top level fragment is a dialog (%s) and should be popped before navigating to another destination (%s)", new Object[]{t2uVarG.getClass(), dktVar.getClass()});
                            zA = kg0Var.a(false);
                        } else {
                            z = false;
                        }
                        kmtVar = (kmt) kg0Var.a.get(dktVar.getClass());
                        if (kmtVar != null) {
                            throw new IllegalStateException("No resolver for destination " + dktVar.getClass());
                        }
                        qktVarA = kmtVar.a(dktVar);
                        if (qktVarA instanceof qkt) {
                            t2u t2uVar = qktVarA.k;
                            th30 th30VarE0 = dg30Var.e0();
                            th30VarE0.getClass();
                            nu9 nu9Var = new nu9(th30VarE0);
                            nu9Var.k(0, t2uVar, "zero_dialog_fragment", 1);
                            nu9Var.g(true, true);
                            return;
                        }
                        if (qktVarA instanceof rkt) {
                            kg0Var.f(new gg0(((rkt) qktVarA).k), ifl1Var, z);
                            return;
                        }
                        if (qktVarA instanceof skt) {
                            skt sktVar = (skt) qktVarA;
                            kg0Var.f(new hg0(sktVar.l, sktVar.k), ifl1Var, z);
                            return;
                        }
                        if (qktVarA instanceof pkt) {
                            eg.o();
                            return;
                        }
                        intent = (Intent) ((pkt) qktVarA).k.invoke(dg30Var);
                        try {
                            dg30Var.startActivity(intent, null);
                            break;
                        } catch (SecurityException unused) {
                            ohv0 ohv0Var = kg0Var.c;
                            Uri data = intent.getData();
                            ohv0Var.a(new jhv0("zero_navigator", "start_activity_security_exception", 4, data != null ? data.getScheme() : null));
                            if (intent.getData() != null || intent.getClipData() != null) {
                                intent.setData(null);
                                intent.setClipData(null);
                                dg30Var.startActivity(intent, null);
                            }
                        }
                        if (ejbVar != null) {
                            dg30Var.overridePendingTransition(2130772036, 2130772037);
                            return;
                        }
                        return;
                    }
                    zA = kg0Var.a(false);
                    kmtVar = (kmt) kg0Var.a.get(dktVar.getClass());
                    if (kmtVar != null) {
                        throw new IllegalStateException("No resolver for destination " + dktVar.getClass());
                    }
                    qktVarA = kmtVar.a(dktVar);
                    if (qktVarA instanceof qkt) {
                        t2u t2uVar2 = qktVarA.k;
                        th30 th30VarE1 = dg30Var.e0();
                        th30VarE1.getClass();
                        nu9 nu9Var2 = new nu9(th30VarE1);
                        nu9Var2.k(0, t2uVar2, "zero_dialog_fragment", 1);
                        nu9Var2.g(true, true);
                        return;
                    }
                    if (qktVarA instanceof rkt) {
                        kg0Var.f(new gg0(((rkt) qktVarA).k), ifl1Var, z);
                        return;
                    }
                    if (qktVarA instanceof skt) {
                        skt sktVar2 = (skt) qktVarA;
                        kg0Var.f(new hg0(sktVar2.l, sktVar2.k), ifl1Var, z);
                        return;
                    } else {
                        if (qktVarA instanceof pkt) {
                            eg.o();
                            return;
                        }
                        intent = (Intent) ((pkt) qktVarA).k.invoke(dg30Var);
                        dg30Var.startActivity(intent, null);
                        if (ejbVar != null) {
                            dg30Var.overridePendingTransition(2130772036, 2130772037);
                            return;
                        }
                        return;
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("The resolver for " + dktVar.getClass() + " does not have the same class", e);
                }
                z = !zA;
                break;
            case 1:
                if (((wtg) this.c).Y || !((wtg) this.c).f.containsKey((String) this.d)) {
                    return;
                }
                lag lagVar = ((wtg) this.c).e;
                String str = (String) this.d;
                String str2 = (String) this.e;
                boolean z2 = this.b;
                jtg jtgVar = (jtg) lagVar.b;
                gtg gtgVar = (gtg) jtgVar.d.a.getValue();
                itg itgVar = (itg) jtgVar.b.get(str);
                if (itgVar != null) {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    itgVar.b = str2 != null ? new htg(str2, z2) : null;
                    if (u890.j(((gtg) jtgVar.a.getValue()).a, str)) {
                        jtgVar.a(str);
                    }
                }
                gtg gtgVar2 = (gtg) jtgVar.d.a.getValue();
                if (u890.j(gtgVar2, gtgVar)) {
                    return;
                }
                ((ftg) lagVar.c).a(gtgVar2);
                return;
            case 2:
                fpo0 fpo0Var = (fpo0) this.c;
                th30 th30Var = ((gpo0) this.d).b;
                boolean z3 = this.b;
                String str3 = (String) this.e;
                int i = fpo0.k2;
                fpo0Var.h2 = z3;
                fpo0Var.i2 = str3;
                fpo0Var.g1(th30Var, "notification-opt-in-bottom-sheet-fragment");
                return;
            default:
                kt91 kt91Var = ((w9i1) this.c).c;
                if (((l811) this.d).a) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956753});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    er91Var2 = new er91((fs91) null, "", 2131956753, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                } else {
                    String str4 = (String) this.e;
                    boolean z4 = this.b;
                    if (str4 != null) {
                        er91Var = new er91((fs91) null, "Bug reported! ".concat(str4), (Integer) null, "Open", (Integer) null, new gl61("https://spotify.atlassian.net/browse/".concat(str4), (byte) 14), (cvr) null, (xq91) null, false);
                    } else {
                        int i2 = z4 ? 2131956744 : 2131963560;
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i2)});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        er91Var = new er91((fs91) null, "", Integer.valueOf(i2), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                    }
                    er91Var2 = er91Var;
                }
                kt91Var.k(er91Var2);
                return;
        }
    }

    public /* synthetic */ jg0(Object obj, Serializable serializable, String str, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = serializable;
        this.e = str;
        this.b = z;
    }

    public jg0(ifl1 ifl1Var, boolean z, kg0 kg0Var, dkt dktVar) {
        this.a = (byte) 0;
        this.c = ifl1Var;
        this.b = z;
        this.d = kg0Var;
        this.e = dktVar;
    }
}
