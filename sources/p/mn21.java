package p;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mn21 implements Comparable {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private opc mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private ky21 mErrorListener;
    private final uqk1 mEventLog;
    private final Object mLock;
    private final int mMethod;
    private jn21 mRequestCompleteListener;
    private op21 mRequestQueue;
    private boolean mResponseDelivered;
    private vc31 mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public mn21(String str, ky21 ky21Var) {
        Uri uri;
        String host;
        this.mEventLog = uqk1.c ? new uqk1() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        int iHashCode = 0;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = 0;
        this.mUrl = str;
        this.mErrorListener = ky21Var;
        f3a f3aVar = new f3a();
        f3aVar.a = 2500;
        setRetryPolicy(f3aVar);
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.mDefaultTrafficStatsTag = iHashCode;
    }

    public static byte[] a(String str, Map map) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode((String) entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            bhn0.o(l1d.m("Encoding not supported: ", str), e);
            return null;
        }
    }

    public void addMarker(String str) {
        if (uqk1.c) {
            this.mEventLog.a(Thread.currentThread().getId(), str);
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(mn21 mn21Var) {
        int iOrdinal;
        int iOrdinal2;
        kn21 priority = getPriority();
        kn21 priority2 = mn21Var.getPriority();
        if (priority == priority2) {
            iOrdinal = this.mSequence.intValue();
            iOrdinal2 = mn21Var.mSequence.intValue();
        } else {
            iOrdinal = priority2.ordinal();
            iOrdinal2 = priority.ordinal();
        }
        return iOrdinal - iOrdinal2;
    }

    public void deliverError(VolleyError volleyError) {
        ky21 ky21Var;
        synchronized (this.mLock) {
            ky21Var = this.mErrorListener;
        }
        if (ky21Var != null) {
            ky21Var.b(volleyError);
        }
    }

    public abstract void deliverResponse(Object obj);

    public void finish(String str) {
        op21 op21Var = this.mRequestQueue;
        if (op21Var != null) {
            synchronized (op21Var.b) {
                op21Var.b.remove(this);
            }
            synchronized (op21Var.j) {
                Iterator it = op21Var.j.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            op21Var.b();
        }
        if (uqk1.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new in21(this, str, id));
            } else {
                this.mEventLog.a(id, str);
                this.mEventLog.b(toString());
            }
        }
    }

    public byte[] getBody() {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return a(getParamsEncoding(), params);
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public opc getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    public ky21 getErrorListener() {
        ky21 ky21Var;
        synchronized (this.mLock) {
            ky21Var = this.mErrorListener;
        }
        return ky21Var;
    }

    public Map<String, String> getHeaders() {
        return Collections.EMPTY_MAP;
    }

    public int getMethod() {
        return this.mMethod;
    }

    public Map<String, String> getParams() {
        return null;
    }

    public String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    @Deprecated
    public byte[] getPostBody() {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return a(getPostParamsEncoding(), postParams);
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    public Map<String, String> getPostParams() {
        return getParams();
    }

    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public kn21 getPriority() {
        return kn21.a;
    }

    public vc31 getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        eg.m("getSequence called before setSequence");
        return 0;
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return ((f3a) getRetryPolicy()).a;
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        cik1 cik1Var;
        synchronized (this.mLock) {
            cik1Var = this.mRequestCompleteListener;
        }
        if (cik1Var != null) {
            cik1Var.l(this);
        }
    }

    public void notifyListenerResponseReceived(ty21 ty21Var) {
        cik1 cik1Var;
        List list;
        synchronized (this.mLock) {
            cik1Var = this.mRequestCompleteListener;
        }
        if (cik1Var != null) {
            cik1 cik1Var2 = cik1Var;
            opc opcVar = ty21Var.b;
            if (opcVar != null) {
                if (opcVar.e >= System.currentTimeMillis()) {
                    String cacheKey = getCacheKey();
                    synchronized (cik1Var2) {
                        list = (List) ((HashMap) cik1Var2.b).remove(cacheKey);
                    }
                    if (list != null) {
                        if (vqk1.a) {
                            vqk1.b("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((ouz) cik1Var2.c).s((mn21) it.next(), ty21Var, (xwn1) null);
                        }
                        return;
                    }
                    return;
                }
            }
            cik1Var2.l(this);
        }
    }

    public abstract ty21 parseNetworkResponse(h8o0 h8o0Var);

    public void sendEvent(int i) {
        op21 op21Var = this.mRequestQueue;
        if (op21Var != null) {
            op21Var.b();
        }
    }

    public mn21 setCacheEntry(opc opcVar) {
        this.mCacheEntry = opcVar;
        return this;
    }

    public void setNetworkRequestCompleteListener(jn21 jn21Var) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = jn21Var;
        }
    }

    public mn21 setRequestQueue(op21 op21Var) {
        this.mRequestQueue = op21Var;
        return this;
    }

    public mn21 setRetryPolicy(vc31 vc31Var) {
        this.mRetryPolicy = vc31Var;
        return this;
    }

    public final mn21 setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    public final mn21 setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    public final mn21 setShouldRetryConnectionErrors(boolean z) {
        this.mShouldRetryConnectionErrors = z;
        return this;
    }

    public final mn21 setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    public mn21 setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        return (isCanceled() ? "[X] " : "[ ] ") + getUrl() + " " + ("0x" + Integer.toHexString(getTrafficStatsTag())) + " " + getPriority() + " " + this.mSequence;
    }

    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }
}
