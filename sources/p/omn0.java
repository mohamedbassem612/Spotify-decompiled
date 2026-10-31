package p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class omn0 {
    public static final omn0 a;
    public static final ArrayList b;
    public static final AtomicBoolean c;
    public static final Integer[] d;

    static {
        omn0 omn0Var = new omn0();
        a = omn0Var;
        b = omn0Var.a();
        ArrayList arrayList = null;
        if (!dhn.a.contains(omn0Var)) {
            try {
                ArrayList arrayListH = p7h.H(new nmn0[]{new lmn0((byte) 0)});
                arrayListH.addAll(omn0Var.a());
                arrayList = arrayListH;
            } catch (Throwable th) {
                dhn.a(omn0Var, th);
            }
        }
        omn0 omn0Var2 = a;
        if (!dhn.a.contains(omn0Var2)) {
            try {
                HashMap map = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new lmn0((byte) 2));
                ArrayList arrayList3 = b;
                map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                map.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th2) {
                dhn.a(omn0Var2, th2);
            }
        }
        c = new AtomicBoolean(false);
        d = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final int b(TreeSet treeSet, int i, int[] iArr) {
        if (dhn.a.contains(omn0.class)) {
            return 0;
        }
        if (treeSet != null) {
            try {
                int length = iArr.length - 1;
                Iterator itDescendingIterator = treeSet.descendingIterator();
                int iMax = -1;
                while (itDescendingIterator.hasNext()) {
                    Integer num = (Integer) itDescendingIterator.next();
                    iMax = Math.max(iMax, num.intValue());
                    while (length >= 0 && iArr[length] > num.intValue()) {
                        length--;
                    }
                    if (length < 0) {
                        break;
                    }
                    if (iArr[length] == num.intValue()) {
                        if (length % 2 != 0) {
                            break;
                        }
                        return Math.min(iMax, i);
                    }
                }
            } catch (Throwable th) {
                dhn.a(omn0.class, th);
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    public static final Intent d(Context context) {
        if (!dhn.a.contains(omn0.class)) {
            try {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((nmn0) it.next()).c()).addCategory("android.intent.category.DEFAULT");
                    if (dhn.a.contains(omn0.class) || intentAddCategory == null) {
                        intentAddCategory = null;
                    } else {
                        try {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0);
                            if (resolveInfoResolveService == null || !ag10.a(context, resolveInfoResolveService.serviceInfo.packageName)) {
                                intentAddCategory = null;
                            }
                        } catch (Throwable th) {
                            dhn.a(omn0.class, th);
                        }
                    }
                    if (intentAddCategory != null) {
                        return intentAddCategory;
                    }
                }
            } catch (Throwable th2) {
                dhn.a(omn0.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:5:0x000c, B:26:0x0048, B:28:0x0064, B:37:0x008f, B:36:0x008b, B:40:0x0095, B:42:0x009a, B:23:0x0041, B:31:0x0070, B:33:0x0082, B:9:0x0018, B:11:0x0022, B:13:0x0028, B:19:0x0039, B:21:0x003e, B:17:0x0031), top: B:46:0x000c, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:5:0x000c, B:26:0x0048, B:28:0x0064, B:37:0x008f, B:36:0x008b, B:40:0x0095, B:42:0x009a, B:23:0x0041, B:31:0x0070, B:33:0x0082, B:9:0x0018, B:11:0x0022, B:13:0x0028, B:19:0x0039, B:21:0x003e, B:17:0x0031), top: B:46:0x000c, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #2 {all -> 0x008a, blocks: (B:31:0x0070, B:33:0x0082), top: B:50:0x0070, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009a A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:5:0x000c, B:26:0x0048, B:28:0x0064, B:37:0x008f, B:36:0x008b, B:40:0x0095, B:42:0x009a, B:23:0x0041, B:31:0x0070, B:33:0x0082, B:9:0x0018, B:11:0x0022, B:13:0x0028, B:19:0x0039, B:21:0x003e, B:17:0x0031), top: B:46:0x000c, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Intent e(Intent intent, Bundle bundle, FacebookException facebookException) {
        String stringExtra;
        UUID uuidFromString;
        Intent intent2;
        Bundle bundle2;
        Bundle bundle3;
        Set set = dhn.a;
        if (!set.contains(omn0.class)) {
            try {
                if (set.contains(omn0.class)) {
                    uuidFromString = null;
                    if (uuidFromString != null) {
                        intent2 = new Intent();
                        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i(intent));
                        bundle2 = new Bundle();
                        bundle2.putString("action_id", uuidFromString.toString());
                        if (facebookException != null) {
                            if (dhn.a.contains(omn0.class)) {
                                bundle3 = null;
                                bundle2.putBundle("error", bundle3);
                            } else {
                                try {
                                    bundle3 = new Bundle();
                                    bundle3.putString("error_description", facebookException.toString());
                                    if (facebookException instanceof FacebookOperationCanceledException) {
                                        bundle3.putString("error_type", "UserCanceled");
                                    }
                                } catch (Throwable th) {
                                    dhn.a(omn0.class, th);
                                    bundle3 = null;
                                }
                                bundle2.putBundle("error", bundle3);
                            }
                        }
                        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                        if (bundle != null) {
                            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                        }
                        return intent2;
                    }
                } else {
                    try {
                        if (j(i(intent))) {
                            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
                        } else {
                            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                        }
                        if (stringExtra != null) {
                            try {
                                uuidFromString = UUID.fromString(stringExtra);
                            } catch (IllegalArgumentException unused) {
                                wf10 wf10Var = wf10.a;
                                uuidFromString = null;
                                if (uuidFromString != null) {
                                    intent2 = new Intent();
                                    intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i(intent));
                                    bundle2 = new Bundle();
                                    bundle2.putString("action_id", uuidFromString.toString());
                                    if (facebookException != null) {
                                        if (dhn.a.contains(omn0.class)) {
                                            bundle3 = null;
                                            bundle2.putBundle("error", bundle3);
                                        } else {
                                            bundle3 = new Bundle();
                                            bundle3.putString("error_description", facebookException.toString());
                                            if (facebookException instanceof FacebookOperationCanceledException) {
                                                bundle3.putString("error_type", "UserCanceled");
                                            }
                                            bundle2.putBundle("error", bundle3);
                                        }
                                    }
                                    intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                                    if (bundle != null) {
                                        intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                                    }
                                    return intent2;
                                }
                                return null;
                            }
                            if (uuidFromString != null) {
                                intent2 = new Intent();
                                intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i(intent));
                                bundle2 = new Bundle();
                                bundle2.putString("action_id", uuidFromString.toString());
                                if (facebookException != null) {
                                    if (dhn.a.contains(omn0.class)) {
                                        bundle3 = null;
                                        bundle2.putBundle("error", bundle3);
                                    } else {
                                        bundle3 = new Bundle();
                                        bundle3.putString("error_description", facebookException.toString());
                                        if (facebookException instanceof FacebookOperationCanceledException) {
                                            bundle3.putString("error_type", "UserCanceled");
                                        }
                                        bundle2.putBundle("error", bundle3);
                                    }
                                }
                                intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                                if (bundle != null) {
                                    intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                                }
                                return intent2;
                            }
                        } else {
                            uuidFromString = null;
                            if (uuidFromString != null) {
                                intent2 = new Intent();
                                intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i(intent));
                                bundle2 = new Bundle();
                                bundle2.putString("action_id", uuidFromString.toString());
                                if (facebookException != null) {
                                    if (dhn.a.contains(omn0.class)) {
                                        bundle3 = null;
                                        bundle2.putBundle("error", bundle3);
                                    } else {
                                        bundle3 = new Bundle();
                                        bundle3.putString("error_description", facebookException.toString());
                                        if (facebookException instanceof FacebookOperationCanceledException) {
                                            bundle3.putString("error_type", "UserCanceled");
                                        }
                                        bundle2.putBundle("error", bundle3);
                                    }
                                }
                                intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                                if (bundle != null) {
                                    intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                                }
                                return intent2;
                            }
                        }
                    } catch (Throwable th2) {
                        dhn.a(omn0.class, th2);
                        uuidFromString = null;
                    }
                }
            } catch (Throwable th3) {
                dhn.a(omn0.class, th3);
                return null;
            }
        }
        return null;
    }

    public static final int g() {
        if (dhn.a.contains(omn0.class)) {
            return 0;
        }
        try {
            return d[0].intValue();
        } catch (Throwable th) {
            dhn.a(omn0.class, th);
            return 0;
        }
    }

    public static final Bundle h(Intent intent) {
        if (dhn.a.contains(omn0.class)) {
            return null;
        }
        try {
            return !j(i(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            dhn.a(omn0.class, th);
            return null;
        }
    }

    public static final int i(Intent intent) {
        if (dhn.a.contains(omn0.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            dhn.a(omn0.class, th);
            return 0;
        }
    }

    public static final boolean j(int i) {
        if (dhn.a.contains(omn0.class)) {
            return false;
        }
        try {
            return f46.M(d, Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            dhn.a(omn0.class, th);
            return false;
        }
    }

    public static final void k() {
        if (dhn.a.contains(omn0.class)) {
            return;
        }
        try {
            if (c.compareAndSet(false, true)) {
                wf10.c().execute(new em5((byte) 3));
            }
        } catch (Throwable th) {
            dhn.a(omn0.class, th);
        }
    }

    public final ArrayList a() {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            return p7h.H(new nmn0[]{new mmn0(), new lmn0((byte) 3)});
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final Intent c(nmn0 nmn0Var, String str, Collection collection, String str2, boolean z, int i, String str3, String str4, boolean z2, String str5, boolean z3, int i2, boolean z4, boolean z5, String str6, String str7, String str8) {
        String strConcat;
        Set set = dhn.a;
        if (!set.contains(this)) {
            try {
                String strB = nmn0Var.b();
                if (strB != null) {
                    Intent intentPutExtra = new Intent().setClassName(nmn0Var.c(), strB).putExtra("client_id", str);
                    wf10 wf10Var = wf10.a;
                    intentPutExtra.putExtra("facebook_sdk_version", "18.2.3");
                    if (!(collection == null || collection.isEmpty())) {
                        intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
                    }
                    if (!fpi1.y(str2)) {
                        intentPutExtra.putExtra("e2e", str2);
                    }
                    intentPutExtra.putExtra("state", str3);
                    intentPutExtra.putExtra("response_type", nmn0Var.d());
                    intentPutExtra.putExtra("nonce", str6);
                    intentPutExtra.putExtra("return_scopes", "true");
                    if (z) {
                        intentPutExtra.putExtra("default_audience", eqq.e(i));
                    }
                    intentPutExtra.putExtra("legacy_override", wf10.d());
                    intentPutExtra.putExtra("auth_type", str4);
                    if (z2) {
                        intentPutExtra.putExtra("fail_on_logged_out", true);
                    }
                    intentPutExtra.putExtra("messenger_page_id", str5);
                    intentPutExtra.putExtra("reset_messenger_state", z3);
                    if (z4) {
                        intentPutExtra.putExtra("fx_app", pze0.a(i2));
                    }
                    if (z5) {
                        intentPutExtra.putExtra("skip_dedupe", true);
                    }
                    if (str7 != null && str7.length() != 0) {
                        intentPutExtra.putExtra("https_redirect_uri", str7);
                        return intentPutExtra;
                    }
                    if (str8 != null && str8.length() != 0) {
                        if (set.contains(this)) {
                            strConcat = null;
                        } else {
                            try {
                                strConcat = "intent://".concat(str8);
                            } catch (Throwable th) {
                                dhn.a(this, th);
                                strConcat = null;
                            }
                        }
                        intentPutExtra.putExtra("intent_uri_package_target", strConcat);
                    }
                    return intentPutExtra;
                }
            } catch (Throwable th2) {
                dhn.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final TreeSet f(nmn0 nmn0Var) {
        Uri uri;
        Throwable th;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        Set set = dhn.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = wf10.a().getContentResolver();
            String[] strArr = {"version"};
            if (set.contains(this)) {
                uri = null;
            } else {
                try {
                    uri = Uri.parse("content://" + nmn0Var.c() + ".provider.PlatformProvider/versions");
                } catch (Throwable th2) {
                    dhn.a(this, th2);
                    uri = null;
                }
            }
            try {
                try {
                    providerInfoResolveContentProvider = wf10.a().getPackageManager().resolveContentProvider(nmn0Var.c().concat(".provider.PlatformProvider"), 0);
                } catch (RuntimeException unused) {
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                    } catch (IllegalArgumentException | NullPointerException | SecurityException unused2) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th3) {
                                cursor = cursorQuery;
                                th = th3;
                                if (cursor == null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
            }
        } catch (Throwable th5) {
            dhn.a(this, th5);
            return null;
        }
    }
}
