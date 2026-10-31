package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rq40 extends t1f0 {
    public static final Parcelable.Creator<rq40> CREATOR = new fd40((byte) 9);
    public qq40 c;

    @Override // p.t1f0
    public final void b() {
        qq40 qq40Var = this.c;
        if (qq40Var != null) {
            qq40Var.d = false;
            qq40Var.c = null;
            this.c = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.t1f0
    public final String j() {
        return "get_token";
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0096 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:48:0x0098 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #0 {all -> 0x00d6, blocks: (B:8:0x0017, B:13:0x0022, B:48:0x0098, B:51:0x00a2, B:43:0x0090, B:17:0x0033, B:40:0x008c, B:39:0x0088), top: B:70:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #0 {all -> 0x00d6, blocks: (B:8:0x0017, B:13:0x0022, B:48:0x0098, B:51:0x00a2, B:43:0x0090, B:17:0x0033, B:40:0x008c, B:39:0x0088), top: B:70:0x0017, inners: #2 }] */
    @Override // p.t1f0
    public final int t(rye0 rye0Var) {
        ij81 ij81VarN;
        int i;
        Intent intentD;
        boolean z;
        Context contextJ = h().j();
        if (contextJ == null) {
            contextJ = wf10.a();
        }
        qq40 qq40Var = new qq40(contextJ, rye0Var);
        this.c = qq40Var;
        synchronized (qq40Var) {
            try {
                if (!qq40Var.d) {
                    int i2 = qq40Var.t;
                    omn0 omn0Var = omn0.a;
                    Set set = dhn.a;
                    if (set.contains(omn0.class)) {
                        i = 0;
                        if (i != -1) {
                            intentD = omn0.d(qq40Var.a);
                            if (intentD == null) {
                                z = false;
                            } else {
                                qq40Var.d = true;
                                qq40Var.a.bindService(intentD, qq40Var, 1);
                                z = true;
                            }
                        }
                    } else {
                        try {
                            omn0 omn0Var2 = omn0.a;
                            ArrayList arrayList = omn0.b;
                            int[] iArr = {i2};
                            if (set.contains(omn0Var2)) {
                                ij81VarN = null;
                                i = ij81VarN.b;
                                if (i != -1) {
                                    intentD = omn0.d(qq40Var.a);
                                    if (intentD == null) {
                                        z = false;
                                    } else {
                                        qq40Var.d = true;
                                        qq40Var.a.bindService(intentD, qq40Var, 1);
                                        z = true;
                                    }
                                }
                            } else {
                                try {
                                    omn0.k();
                                    if (arrayList != null) {
                                        Iterator it = arrayList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                ij81VarN = nmn1.n();
                                                break;
                                            }
                                            nmn0 nmn0Var = (nmn0) it.next();
                                            TreeSet treeSet = nmn0Var.a;
                                            if (treeSet == null || treeSet.isEmpty()) {
                                                nmn0Var.a(false);
                                            }
                                            int iB = omn0.b(nmn0Var.a, omn0.g(), iArr);
                                            if (iB != -1) {
                                                ij81VarN = new ij81((byte) 23);
                                                ij81VarN.b = iB;
                                                break;
                                            }
                                        }
                                    } else {
                                        ij81VarN = nmn1.n();
                                    }
                                } catch (Throwable th) {
                                    dhn.a(omn0Var2, th);
                                    ij81VarN = null;
                                }
                                i = ij81VarN.b;
                                if (i != -1) {
                                    intentD = omn0.d(qq40Var.a);
                                    if (intentD == null) {
                                        z = false;
                                    } else {
                                        qq40Var.d = true;
                                        qq40Var.a.bindService(intentD, qq40Var, 1);
                                        z = true;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            dhn.a(omn0.class, th2);
                            i = 0;
                        }
                    }
                }
                z = false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z) {
            return 0;
        }
        m4e0 m4e0Var = h().e;
        if (m4e0Var != null) {
            View view = ((l1f0) m4e0Var.b).J1;
            if (view == null) {
                u890.C("progressBar");
                throw null;
            }
            view.setVisibility(0);
        }
        uk4 uk4Var = new uk4(this, rye0Var, (byte) 27);
        qq40 qq40Var2 = this.c;
        if (qq40Var2 != null) {
            qq40Var2.c = uk4Var;
        }
        return 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public final void x(Bundle bundle, rye0 rye0Var) {
        sye0 sye0Var;
        rl8 rl8Var;
        try {
            xd xdVarQ = lyg.q(bundle, rye0Var.d);
            String str = rye0Var.Q0;
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                rl8Var = null;
            } else {
                try {
                    rl8Var = new rl8(string, str);
                } catch (Exception e) {
                    throw new FacebookException(e.getMessage());
                }
            }
            sye0Var = new sye0(rye0Var, 1, xdVarQ, rl8Var, null, null);
        } catch (FacebookException e2) {
            rye0 rye0Var2 = h().g;
            String message = e2.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            sye0Var = new sye0(rye0Var2, 3, null, null, TextUtils.join(": ", arrayList), null);
        }
        h().h(sye0Var);
    }
}
