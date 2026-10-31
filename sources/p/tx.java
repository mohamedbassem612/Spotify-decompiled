package p;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tx implements vfa {
    public final ArrayList a;

    public tx(byte b) {
        switch (b) {
            case 1:
                this.a = new ArrayList(1);
                break;
            case 2:
                List<String> listM = p7h.M(new String[]{"www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"});
                ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
                for (String str : listM) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
                    sb.append("https://");
                    sb.append(str);
                    sb.append("/");
                    arrayList.add(sb.toString());
                }
                this.a = arrayList;
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public void a() {
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((faa0) it.next()).d((CancellationException) null);
                }
                this.a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b(String str) {
        Uri uri = Uri.parse(str);
        uri.getClass();
        if (!TextUtils.isEmpty(uri.toString()) && "https".equals(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
            String string = uri.toString();
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (nhc1.Y(string, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void c(voa0 voa0Var, zsc zscVar, llm llmVar, kd8 kd8Var, hj8 hj8Var) {
        if (voa0Var.a.isEmpty()) {
            return;
        }
        xab1 xab1VarT = fn31.T(llmVar, (o8n) null, 0, new sx(zscVar, voa0Var, hj8Var, kd8Var, null, (byte) 0), 3);
        synchronized (this.a) {
            this.a.add(xab1VarT);
        }
    }
}
