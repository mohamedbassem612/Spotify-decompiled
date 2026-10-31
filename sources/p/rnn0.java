package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rnn0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ snn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rnn0(snn0 snn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = snn0Var;
    }

    public final Object invoke() {
        List list;
        byte b = this.a;
        boolean z = false;
        snn0 snn0Var = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) snn0Var.j.getValue();
                return (mmr0Var == null || (list = (List) mmr0Var.a) == null) ? new ArrayList() : list;
            case 1:
                String str = snn0Var.a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                fragment.getClass();
                snn0.a(fragment, arrayList, sb);
                return new mmr0(arrayList, sb.toString());
            case 2:
                String str2 = (String) snn0Var.l.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                mmr0 mmr0Var2 = (mmr0) snn0Var.j.getValue();
                if (mmr0Var2 != null) {
                    return (String) mmr0Var2.b;
                }
                return null;
            case 4:
                String str3 = snn0Var.a;
                if (str3 != null && Uri.parse(str3).getQuery() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                String str4 = snn0Var.n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            case 6:
                String str5 = snn0Var.e;
                if (str5 != null) {
                    return Pattern.compile(str5, 2);
                }
                return null;
            default:
                String str6 = snn0Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) snn0Var.g.getValue()).booleanValue()) {
                    Uri uri = Uri.parse(str6);
                    for (String str7 : uri.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str7);
                        if (queryParameters.size() > 1) {
                            hhg1.f(cy30.p("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                            return null;
                        }
                        String str8 = (String) o7h.s0(queryParameters);
                        if (str8 == null) {
                            snn0Var.i = true;
                            str8 = str7;
                        }
                        Matcher matcher = snn0.r.matcher(str8);
                        qnn0 qnn0Var = new qnn0();
                        int iEnd = 0;
                        while (matcher.find()) {
                            qnn0Var.b.add(matcher.group(1));
                            sb2.append(Pattern.quote(str8.substring(iEnd, matcher.start())));
                            sb2.append("(.+?)?");
                            iEnd = matcher.end();
                        }
                        if (iEnd < str8.length()) {
                            sb2.append(Pattern.quote(str8.substring(iEnd)));
                        }
                        qnn0Var.a = nhc1.W(sb2.toString(), ".*", "\\E.*\\Q");
                        linkedHashMap.put(str7, qnn0Var);
                    }
                }
                return linkedHashMap;
        }
    }
}
