package p;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vsn1 {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        Log.isLoggable(str, 5);
        return 6;
    }

    public static void b(long j, String str, String str2, Bundle bundle) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(iua iuaVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", iuaVar.a);
        bundle.putString("DEBUG_MESSAGE", iuaVar.c);
        bundle.putInt("LOG_REASON", lqn1.c(i));
        return bundle;
    }

    public static Bundle d(String str, String str2, ArrayList arrayList, uan1 uan1Var, long j) {
        Bundle bundle = new Bundle();
        b(j, str, str2, bundle);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        vrn1 vrn1Var = dsn1.b;
        Object[] objArr = {"subs", "inapp"};
        ago1.v(2, objArr);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>((Collection) dsn1.l(2, objArr)));
        Object[] objArr2 = {"inapp"};
        ago1.v(1, objArr2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>((Collection) dsn1.l(1, objArr2)));
        Object[] objArr3 = {"inapp"};
        ago1.v(1, objArr3);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>((Collection) dsn1.l(1, objArr3)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            e1z0 e1z0Var = (e1z0) arrayList.get(i);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z2 |= !TextUtils.isEmpty(null);
            if (e1z0Var.b.equals("first_party")) {
                bhn0.i("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                return null;
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z2) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static iua e(String str, Intent intent) {
        if (intent != null) {
            v vVarA = iua.a();
            vVarA.a = a(intent.getExtras(), str);
            vVarA.c = f(intent.getExtras(), str);
            return vVarA.a();
        }
        Log.isLoggable("BillingHelper", 5);
        v vVarA2 = iua.a();
        vVarA2.a = 6;
        vVarA2.c = "An internal error occurred.";
        return vVarA2.a();
    }

    public static String f(Bundle bundle, String str) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        "Unexpected type for debug message: ".concat(obj.getClass().getName());
        Log.isLoggable(str, 5);
        return "";
    }

    public static void g(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = 40000;
        while (!str2.isEmpty() && i > 0) {
            int iMin = Math.min(str2.length(), Math.min(4000, i));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i -= iMin;
        }
    }

    public static void h() {
        Log.isLoggable("BillingLogger", 5);
    }

    public static void i(String str) {
        try {
            Log.isLoggable(str, 5);
        } catch (Throwable unused) {
        }
    }

    public static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            "Got JSONException while parsing purchase data: ".concat(e.toString());
            Log.isLoggable("BillingHelper", 5);
            return null;
        }
    }
}
