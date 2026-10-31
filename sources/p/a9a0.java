package p;

import android.net.ConnectivityManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.chromium.net.impl.NetworkExceptionImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class a9a0 implements j9a0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i9a0 b;

    public /* synthetic */ a9a0(i9a0 i9a0Var, byte b) {
        this.a = b;
        this.b = i9a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    @Override // p.j9a0
    public final void run() throws IOException {
        List list;
        HttpURLConnection httpURLConnection;
        wj80 wj80Var = null;
        byte b = 0;
        switch (this.a) {
            case 0:
                i9a0 i9a0Var = this.b;
                f9a0 f9a0Var = i9a0Var.a;
                if (i9a0Var.q == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                String headerField = "http/1.1";
                int i = 0;
                while (true) {
                    String headerFieldKey = i9a0Var.q.getHeaderFieldKey(i);
                    if (headerFieldKey == null) {
                        int responseCode = i9a0Var.q.getResponseCode();
                        v3i1 v3i1Var = new v3i1(new ArrayList(i9a0Var.e), responseCode, i9a0Var.q.getResponseMessage(), Collections.unmodifiableList(arrayList), headerField);
                        if (responseCode >= 300 && responseCode < 400 && (list = (List) v3i1Var.g.getAsMap().get("location")) != null) {
                            i9a0Var.f(1, 2, new c45(i9a0Var, (String) list.get(0), v3i1Var, (byte) 23));
                            return;
                        }
                        i9a0Var.o = v3i1Var;
                        i9a0Var.d();
                        HttpURLConnection httpURLConnection2 = i9a0Var.q;
                        if (responseCode < 400) {
                            InputStream inputStream = httpURLConnection2.getInputStream();
                            i9a0Var.n = inputStream instanceof FileInputStream ? ((FileInputStream) inputStream).getChannel() : new wj80(inputStream);
                            f9a0Var.getClass();
                            f9a0Var.b(new bf70(f9a0Var, (byte) 5), "onResponseStarted");
                            return;
                        }
                        InputStream errorStream = httpURLConnection2.getErrorStream();
                        i9a0Var.n = errorStream != null ? errorStream instanceof FileInputStream ? ((FileInputStream) errorStream).getChannel() : new wj80(errorStream) : null;
                        f9a0Var.getClass();
                        f9a0Var.b(new bf70(f9a0Var, (byte) 5), "onResponseStarted");
                        return;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        headerField = i9a0Var.q.getHeaderField(i);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, i9a0Var.q.getHeaderField(i)));
                    }
                    i++;
                }
                break;
            default:
                i9a0 i9a0Var2 = this.b;
                if (i9a0Var2.f.get() == 8) {
                    return;
                }
                URL url = new URL(i9a0Var2.m);
                HttpURLConnection httpURLConnection3 = i9a0Var2.q;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                    i9a0Var2.q = null;
                }
                long j = i9a0Var2.v;
                if (j == -1) {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    i9a0Var2.q = httpURLConnection;
                } else {
                    for (wj80 wj80Var2 : ((ConnectivityManager) i9a0Var2.s.g.getSystemService("connectivity")).getAllNetworks()) {
                        if (wj80Var2.getNetworkHandle() == j) {
                            wj80Var = wj80Var2;
                            if (wj80Var != null) {
                                throw new NetworkExceptionImpl();
                            }
                            httpURLConnection = (HttpURLConnection) wj80Var.openConnection(url);
                            i9a0Var2.q = httpURLConnection;
                        }
                    }
                    if (wj80Var != null) {
                        throw new NetworkExceptionImpl();
                    }
                    httpURLConnection = (HttpURLConnection) wj80Var.openConnection(url);
                    i9a0Var2.q = httpURLConnection;
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                if (!i9a0Var2.d.containsKey("User-Agent")) {
                    i9a0Var2.d.put("User-Agent", i9a0Var2.c);
                }
                for (Map.Entry entry : i9a0Var2.d.entrySet()) {
                    i9a0Var2.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                i9a0Var2.q.setRequestMethod(i9a0Var2.i);
                axh1 axh1Var = i9a0Var2.j;
                if (axh1Var != null) {
                    g9a0 g9a0Var = new g9a0(i9a0Var2, i9a0Var2.k, i9a0Var2.b, i9a0Var2.q, axh1Var);
                    i9a0Var2.r = g9a0Var;
                    g9a0Var.b(new s7s(g9a0Var, i9a0Var2.e.size() == 1, (byte) 2), "start");
                    return;
                } else {
                    i9a0Var2.l = 10;
                    i9a0Var2.q.connect();
                    i9a0Var2.l = 13;
                    i9a0Var2.c(new z8a0(i9a0Var2, new a9a0(i9a0Var2, b), (byte) 2), "fireGetHeaders");
                    return;
                }
        }
    }
}
