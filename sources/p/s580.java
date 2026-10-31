package p;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s580 implements InvocationHandler {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:57:0x021f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0225  */
    /* JADX WARN: Code duplicated, block: B:78:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public v580 a(Context context) {
        Class cls;
        Object objB;
        v580 v580Var;
        Class clsX = c680.x("com.android.billingclient.api.BillingClient");
        Class clsX2 = c680.x("com.android.billingclient.api.Purchase");
        Class clsX3 = c680.x("com.android.billingclient.api.ProductDetails");
        Class clsX4 = c680.x("com.android.billingclient.api.PurchaseHistoryRecord");
        Class clsX5 = c680.x("com.android.billingclient.api.QueryProductDetailsParams$Product");
        Class clsX6 = c680.x("com.android.billingclient.api.BillingResult");
        Class clsX7 = c680.x("com.android.billingclient.api.QueryProductDetailsParams");
        Class clsX8 = c680.x("com.android.billingclient.api.QueryPurchaseHistoryParams");
        Class clsX9 = c680.x("com.android.billingclient.api.QueryPurchasesParams");
        Class clsX10 = c680.x("com.android.billingclient.api.QueryProductDetailsParams$Builder");
        Class clsX11 = c680.x("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
        Class clsX12 = c680.x("com.android.billingclient.api.QueryPurchasesParams$Builder");
        Class clsX13 = c680.x("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
        Class clsX14 = c680.x("com.android.billingclient.api.BillingClient$Builder");
        Class clsX15 = c680.x("com.android.billingclient.api.PurchasesUpdatedListener");
        Class clsX16 = c680.x("com.android.billingclient.api.BillingClientStateListener");
        Class clsX17 = c680.x("com.android.billingclient.api.ProductDetailsResponseListener");
        Class clsX18 = c680.x("com.android.billingclient.api.PurchasesResponseListener");
        Class clsX19 = c680.x("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (clsX == null || clsX2 == null || clsX3 == null || clsX4 == null || clsX5 == null || clsX6 == null || clsX7 == null || clsX8 == null || clsX9 == null || clsX10 == null || clsX11 == null || clsX12 == null || clsX13 == null || clsX14 == null || clsX15 == null || clsX16 == null || clsX17 == null || clsX18 == null || clsX19 == null) {
            v580.b();
            return null;
        }
        Method methodA = c680.A(clsX, "queryPurchasesAsync", new Class[]{clsX9, clsX18});
        Method methodA2 = c680.A(clsX9, "newBuilder", new Class[0]);
        Method methodA3 = c680.A(clsX12, "build", new Class[0]);
        Method methodA4 = c680.A(clsX12, "setProductType", new Class[]{String.class});
        Method methodA5 = c680.A(clsX2, "getOriginalJson", new Class[0]);
        Method methodA6 = c680.A(clsX, "queryPurchaseHistoryAsync", new Class[]{clsX8, clsX19});
        Method methodA7 = c680.A(clsX8, "newBuilder", new Class[0]);
        Method methodA8 = c680.A(clsX11, "build", new Class[0]);
        Method methodA9 = c680.A(clsX11, "setProductType", new Class[]{String.class});
        Method methodA10 = c680.A(clsX4, "getOriginalJson", new Class[0]);
        Method methodA11 = c680.A(clsX, "queryProductDetailsAsync", new Class[]{clsX7, clsX17});
        Method methodA12 = c680.A(clsX7, "newBuilder", new Class[0]);
        Method methodA13 = c680.A(clsX10, "build", new Class[0]);
        Method methodA14 = c680.A(clsX10, "setProductList", new Class[]{List.class});
        Method methodA15 = c680.A(clsX5, "newBuilder", new Class[0]);
        Method methodA16 = c680.A(clsX13, "build", new Class[0]);
        Method methodA17 = c680.A(clsX13, "setProductId", new Class[]{String.class});
        Method methodA18 = c680.A(clsX13, "setProductType", new Class[]{String.class});
        Method methodA19 = c680.A(clsX3, "toString", new Class[0]);
        Method methodA20 = c680.A(clsX, "startConnection", new Class[]{clsX16});
        Method methodA21 = c680.A(clsX6, "getResponseCode", new Class[0]);
        if (methodA == null || methodA2 == null || methodA3 == null || methodA4 == null || methodA5 == null || methodA6 == null || methodA7 == null || methodA8 == null || methodA9 == null || methodA10 == null || methodA11 == null || methodA12 == null || methodA13 == null || methodA14 == null || methodA15 == null || methodA16 == null || methodA17 == null || methodA18 == null || methodA19 == null || methodA20 == null || methodA21 == null) {
            v580.b();
            return null;
        }
        Method methodA22 = c680.A(clsX, "newBuilder", new Class[]{Context.class});
        Method methodA23 = c680.A(clsX14, "setListener", new Class[]{clsX15});
        Method methodA24 = c680.A(clsX14, "enablePendingPurchases", new Class[0]);
        Method methodA25 = c680.A(clsX14, "build", new Class[0]);
        if (methodA25 != null && methodA23 != null && methodA22 != null && methodA24 != null) {
            cls = clsX;
            Object objB2 = c680.B(clsX14, c680.B(clsX, (Object) null, methodA22, new Object[]{context}), methodA23, new Object[]{Proxy.newProxyInstance(clsX15.getClassLoader(), new Class[]{clsX15}, this)});
            if (objB2 != null) {
                objB = c680.B(clsX14, c680.B(clsX14, objB2, methodA24, new Object[0]), methodA25, new Object[0]);
            }
            if (objB == null) {
                v580.b();
                return null;
            }
            v580Var = new v580(objB, cls, clsX2, clsX3, clsX4, clsX5, clsX6, clsX7, clsX8, clsX10, clsX11, clsX13, clsX16, clsX17, clsX19, methodA5, methodA6, methodA7, methodA8, methodA9, methodA10, methodA11, methodA12, methodA13, methodA14, methodA15, methodA16, methodA17, methodA18, methodA19, methodA20, methodA21);
            if (!dhn.a.contains(v580.class)) {
                try {
                    v580.I = v580Var;
                } catch (Throwable th) {
                    dhn.a(v580.class, th);
                }
            }
            if (!dhn.a.contains(v580.class)) {
                try {
                    return v580.I;
                } catch (Throwable th2) {
                    dhn.a(v580.class, th2);
                }
            }
            return null;
        }
        cls = clsX;
        objB = null;
        if (objB == null) {
            v580.b();
            return null;
        }
        v580Var = new v580(objB, cls, clsX2, clsX3, clsX4, clsX5, clsX6, clsX7, clsX8, clsX10, clsX11, clsX13, clsX16, clsX17, clsX19, methodA5, methodA6, methodA7, methodA8, methodA9, methodA10, methodA11, methodA12, methodA13, methodA14, methodA15, methodA16, methodA17, methodA18, methodA19, methodA20, methodA21);
        if (!dhn.a.contains(v580.class)) {
            v580.I = v580Var;
        }
        if (!dhn.a.contains(v580.class)) {
            return v580.I;
        }
        return null;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.a) {
            case 0:
                dhn.a.contains(this);
                break;
        }
        return null;
    }
}
