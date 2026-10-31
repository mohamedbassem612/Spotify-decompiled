package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qbn1 extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ uhk1 c;

    public qbn1(uhk1 uhk1Var, boolean z) {
        this.c = uhk1Var;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        qbn1 qbn1Var;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    qbn1Var = this;
                    context.registerReceiver(qbn1Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    qbn1Var = this;
                    context.registerReceiver(qbn1Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                qbn1Var.a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (this.a) {
            context.unregisterReceiver(this);
            this.a = false;
        } else {
            int i = vsn1.a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }

    public final void d(Bundle bundle, iua iuaVar, int i, jno1 jno1Var, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            lxn1 lxn1Var = (lxn1) this.c.d;
            if (byteArray != null) {
                ((bym1) lxn1Var).r(nlo1.u(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((bym1) lxn1Var).r(hxn1.b(23, i, iuaVar, null, jno1Var), j, z);
            }
        } catch (Throwable unused) {
            int i2 = vsn1.a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0204 A[Catch: all -> 0x021f, TRY_ENTER, TryCatch #0 {all -> 0x021f, blocks: (B:83:0x01cb, B:87:0x0204, B:88:0x021b), top: B:94:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0225  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        jno1 jno1Var;
        iua iuaVarE;
        ArrayList arrayList;
        doo1 doo1Var;
        int iIntValue;
        uhk1 uhk1Var = this.c;
        lxn1 lxn1Var = (lxn1) uhk1Var.d;
        s141 s141Var = (s141) uhk1Var.c;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        jno1 jno1Var2 = jno1.d;
        jno1 jno1Var3 = jno1.c;
        jno1 jno1Var4 = jno1.e;
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    jno1Var = jno1Var4;
                } else {
                    jno1Var = jno1.b;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                jno1Var = jno1Var2;
            } else {
                jno1Var = jno1.b;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            jno1Var = jno1Var3;
        } else {
            jno1Var = jno1.b;
        }
        int i = (jno1Var.equals(jno1Var2) || jno1Var.equals(jno1Var4)) ? 2 : jno1Var.equals(jno1Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            int i2 = vsn1.a;
            Log.isLoggable("BillingBroadcastManager", 5);
            iua iuaVar = iyn1.f;
            ((bym1) lxn1Var).i(hxn1.b(11, i, iuaVar, null, jno1Var));
            if (s141Var != null) {
                s141Var.c(iuaVar, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i3 = vsn1.a;
            v vVarA = iua.a();
            vVarA.a = vsn1.a(intent.getExtras(), "BillingBroadcastManager");
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                Log.isLoggable("BillingBroadcastManager", 5);
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    vsn1.g("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                } else {
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName());
                        Log.isLoggable("BillingBroadcastManager", 5);
                    }
                    vVarA.b = iIntValue;
                    vVarA.c = vsn1.f(intent.getExtras(), "BillingBroadcastManager");
                    iuaVarE = vVarA.a();
                }
            }
            iIntValue = 0;
            vVarA.b = iIntValue;
            vVarA.c = vsn1.f(intent.getExtras(), "BillingBroadcastManager");
            iuaVarE = vVarA.a();
        } else {
            iuaVarE = vsn1.e("BillingBroadcastManager", intent);
        }
        long j = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!jno1Var.equals(jno1Var3) && !jno1Var.equals(jno1Var2)) {
            if (jno1Var.equals(jno1Var4)) {
                if (iuaVarE.a != 0) {
                    iua iuaVar2 = iuaVarE;
                    d(extras, iuaVar2, i, jno1Var, j, z);
                    vrn1 vrn1Var = dsn1.b;
                    s141Var.c(iuaVar2, ttn1.e);
                    return;
                }
                Log.isLoggable("BillingBroadcastManager", 5);
                iua iuaVar3 = iyn1.f;
                ((bym1) lxn1Var).r(hxn1.b(141, i, iuaVar3, null, jno1Var), j, z);
                vrn1 vrn1Var2 = dsn1.b;
                s141Var.c(iuaVar3, ttn1.e);
                return;
            }
            return;
        }
        iua iuaVar4 = iuaVarE;
        int i4 = i;
        jno1 jno1Var5 = jno1Var;
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseJ = vsn1.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseJ == null) {
                vsn1.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
            } else {
                arrayList2.add(purchaseJ);
            }
            if (iuaVar4.a == 0) {
                gmo1 gmo1VarC = hxn1.c(i4, jno1Var5);
                bym1 bym1Var = (bym1) lxn1Var;
                bym1Var.getClass();
                try {
                    qlo1 qlo1VarL = gmo1VarC.l();
                    dpo1 dpo1VarL = gmo1VarC.s().l();
                    dpo1VarL.b();
                    ypo1.r(((t9o1) dpo1VarL).b, z);
                    qlo1VarL.b();
                    gmo1.v(((t9o1) qlo1VarL).b, dpo1VarL.a());
                    gmo1 gmo1Var = (gmo1) qlo1VarL.a();
                    doo1Var = (doo1) bym1Var.b;
                    if (j != 0) {
                        xno1 xno1VarL = doo1Var.l();
                        xno1VarL.b();
                        doo1.F(((t9o1) xno1VarL).b, j);
                        doo1Var = (doo1) xno1VarL.a();
                    }
                    bym1Var.v(gmo1Var, doo1Var);
                } catch (Throwable unused) {
                    vsn1.i("BillingLogger");
                }
            } else {
                d(extras, iuaVar4, i4, jno1Var5, j, z);
            }
            s141Var.c(iuaVar4, arrayList);
        }
        vsn1.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i5 = 0; i5 < stringArrayList.size() && i5 < stringArrayList2.size(); i5++) {
            Purchase purchaseJ2 = vsn1.j(stringArrayList.get(i5), stringArrayList2.get(i5));
            if (purchaseJ2 != null) {
                arrayList2.add(purchaseJ2);
            }
        }
        arrayList = arrayList2;
        if (iuaVar4.a == 0) {
            gmo1 gmo1VarC2 = hxn1.c(i4, jno1Var5);
            bym1 bym1Var2 = (bym1) lxn1Var;
            bym1Var2.getClass();
            qlo1 qlo1VarL2 = gmo1VarC2.l();
            dpo1 dpo1VarL2 = gmo1VarC2.s().l();
            dpo1VarL2.b();
            ypo1.r(((t9o1) dpo1VarL2).b, z);
            qlo1VarL2.b();
            gmo1.v(((t9o1) qlo1VarL2).b, dpo1VarL2.a());
            gmo1 gmo1Var2 = (gmo1) qlo1VarL2.a();
            doo1Var = (doo1) bym1Var2.b;
            if (j != 0) {
                xno1 xno1VarL2 = doo1Var.l();
                xno1VarL2.b();
                doo1.F(((t9o1) xno1VarL2).b, j);
                doo1Var = (doo1) xno1VarL2.a();
            }
            bym1Var2.v(gmo1Var2, doo1Var);
        } else {
            d(extras, iuaVar4, i4, jno1Var5, j, z);
        }
        s141Var.c(iuaVar4, arrayList);
    }
}
