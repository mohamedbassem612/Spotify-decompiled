package androidx.compose.runtime.tooling;

import com.comscore.streaming.AdvertisementType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p.f46;
import p.f4i1;
import p.k4p1;
import p.r7h;
import p.smc0;
import p.wd31;
import p.xyj;
import p.zyj;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticComposeException extends RuntimeException {
    public final xyj a;

    public DiagnosticComposeException(xyj xyjVar) {
        this.a = xyjVar;
        if (xyjVar.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, AdvertisementType.OTHER};
        List list = xyjVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            zyj zyjVar = (zyj) list.get(i);
            if (!f46.L(iArr, zyjVar.a)) {
                if (zyjVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((zyj) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        r7h.e0(arrayList);
                    }
                } else {
                    arrayList.add(zyjVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", f4i1.c(((zyj) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        xyj xyjVar = this.a;
        if (!xyjVar.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        smc0 smc0VarN = k4p1.n();
        wd31 wd31Var = new wd31(xyjVar.a);
        int iB = wd31Var.b();
        for (int i = 0; i < iB; i++) {
            ((zyj) wd31Var.get(i)).getClass();
        }
        wd31 wd31Var2 = new wd31(k4p1.k(smc0VarN));
        int iB2 = wd31Var2.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            String str = (String) wd31Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
