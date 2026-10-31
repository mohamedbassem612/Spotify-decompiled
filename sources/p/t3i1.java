package p;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t3i1 extends ExperimentalUrlRequest.Builder {
    public final l7o a;
    public final String b;
    public final UrlRequest.Callback c;
    public final Executor d;
    public String e;
    public boolean g;
    public ArrayList i;
    public UploadDataProvider j;
    public Executor k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43p;
    public RequestFinishedInfo.Listener q;
    public final ArrayList f = new ArrayList();
    public int h = 3;
    public long r = -1;

    public t3i1(String str, UrlRequest.Callback callback, Executor executor, l7o l7oVar) {
        Objects.requireNonNull(str, "URL is required.");
        this.b = str;
        Objects.requireNonNull(callback, "Callback is required.");
        this.c = callback;
        Objects.requireNonNull(executor, "Executor is required.");
        this.d = executor;
        this.a = l7oVar;
    }

    public final void a(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        if (!"Accept-Encoding".equalsIgnoreCase(str)) {
            this.f.add(new AbstractMap.SimpleEntry(str, str2));
        } else if (Log.isLoggable("t3i1", 3)) {
            new Exception();
        }
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.i = arrayList;
        }
        arrayList.add(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder allowDirectExecutor() {
        this.l = true;
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder bindToNetwork(long j) {
        this.r = j;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest build() {
        int i = this.h;
        ArrayList arrayList = this.i;
        boolean z = this.g;
        boolean z2 = this.l;
        boolean z3 = this.m;
        int i2 = this.n;
        boolean z4 = this.o;
        int i3 = this.f43p;
        RequestFinishedInfo.Listener listener = this.q;
        long j = this.r;
        String str = this.e;
        if (str == null) {
            str = "GET";
        }
        return this.a.a(this.b, this.c, this.d, i, arrayList, z, z2, z3, i2, z4, i3, listener, j, str, this.f, this.j, this.k);
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder disableCache() {
        this.g = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.e = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setPriority(int i) {
        this.h = i;
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setRawCompressionDictionary(byte[] bArr, ByteBuffer byteBuffer, String str) {
        Objects.requireNonNull(bArr, "Hash is required");
        if (bArr.length != 32) {
            hhg1.n("SHA-256 hashes are supposed to be 32 bytes");
            return null;
        }
        Objects.requireNonNull(byteBuffer, "Dictionary is required");
        if (byteBuffer.isDirect()) {
            Objects.requireNonNull(str, "Dictionary ID cannot be null. If missing, pass an empty string");
            return this;
        }
        hhg1.n("byteBuffer must be a direct ByteBuffer.");
        return null;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.q = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        this.m = true;
        this.n = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        this.o = true;
        this.f43p = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.j = uploadDataProvider;
        Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        this.k = executor;
        if (this.e == null) {
            this.e = "POST";
        }
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setPriority(int i) {
        this.h = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.q = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder allowDirectExecutor() {
        this.l = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder disableCache() {
        this.g = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setTrafficStatsTag(int i) {
        this.m = true;
        this.n = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setTrafficStatsUid(int i) {
        this.o = true;
        this.f43p = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setHttpMethod(String str) {
        setHttpMethod(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final ExperimentalUrlRequest.Builder disableConnectionMigration() {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.i = arrayList;
        }
        arrayList.add(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.j = uploadDataProvider;
        Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        this.k = executor;
        if (this.e == null) {
            this.e = "POST";
        }
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setIdempotency(int i) {
        return this;
    }
}
