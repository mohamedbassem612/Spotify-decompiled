package p;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class wl21 {
    public static final Set a = f46.S0(new String[]{"contentreporting.spotify.com", "accounts.spotify.com", "support.spotify.com"});

    public static final void a(yl21 yl21Var, g341 g341Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1285324553);
        int i2 = i | (x340Var.g(yl21Var) ? 4 : 2) | (x340Var.i(g341Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            tob1 tob1Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new km21(yl21Var.d, new r9y0(ven0Var, (byte) 9));
                x340Var.s0(objT3);
            }
            km21 km21Var = (km21) objT3;
            int i3 = i2 & 896;
            boolean zI = x340Var.i(tob1Var) | x340Var.i(ven0Var) | (i3 == 256);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new dh6(function0, tob1Var, ven0Var, (byte) 4);
                x340Var.s0(objT4);
            }
            q3p1.b(6, 0, (Function0) objT4, x340Var, true);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            boolean z = i3 == 256;
            int i4 = i2 & 14;
            boolean zI2 = (i4 == 4) | z | x340Var.i(km21Var) | x340Var.i(tob1Var);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                vvu0 vvu0Var = new vvu0(km21Var, function0, yl21Var, tob1Var, (byte) 21);
                tob1Var = tob1Var;
                x340Var.s0(vvu0Var);
                objT5 = vvu0Var;
            }
            iu30 iu30Var = (iu30) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = pl21.c;
                x340Var.s0(objT6);
            }
            iu30 iu30Var2 = (iu30) objT6;
            boolean z2 = false;
            dm5.b(iu30Var, qim0VarD, (iu30) null, iu30Var2, (iu30) null, x340Var, 3072, 20);
            WebView webView = (WebView) tob1Var.getValue();
            boolean zI3 = x340Var.i(tob1Var);
            if (i4 == 4) {
                z2 = true;
            }
            boolean zI4 = z2 | zI3 | x340Var.i(g341Var);
            Object objT7 = x340Var.T();
            if (zI4 || objT7 == m4cVar) {
                sew0 sew0Var = new sew0(yl21Var, g341Var, tob1Var, (lnm) null, (byte) 15);
                x340Var.s0(sew0Var);
                objT7 = sew0Var;
            }
            qxd0.t(webView, x340Var, (vu30) objT7);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(i, yl21Var, g341Var, function0, qim0Var2, (byte) 17);
        }
    }

    public static final void b(WebView webView, Map map) {
        mfa0 mfa0Var = nfa0.d;
        nma0 nma0VarSerializer = uga0.Companion.serializer();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
        }
        webView.evaluateJavascript(jhc1.J("\n    window._reportParams = " + mfa0Var.b(nma0VarSerializer, new uga0(linkedHashMap)) + ";\n    window.webkit = window.webkit || {};\n    window.webkit.messageHandlers = window.webkit.messageHandlers || {};\n    window.webkit.messageHandlers.report = {\n      postMessage: function(msg) {\n        ReportBridge.postMessage(JSON.stringify(msg));\n      }\n    };\n    "), null);
    }

    public static final boolean c(String str) {
        Set set = a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (nhc1.S((String) it.next(), Uri.parse(str).getHost(), true)) {
                return true;
            }
        }
        return false;
    }
}
