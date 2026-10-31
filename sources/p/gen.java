package p;

import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gen {
    public static final se11 i = new se11("[\n\t\r ]");
    public final pjm0 a;
    public final q8n b;
    public long e;
    public long f;
    public final long c = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
    public final double d = 1.0E9d / Os.sysconf(OsConstants._SC_CLK_TCK);
    public boolean g = true;
    public final idd1 h = new idd1(lmm.t);

    public gen(pjm0 pjm0Var, q8n q8nVar) {
        this.a = pjm0Var;
        this.b = q8nVar;
    }

    public static final long f(gen genVar) {
        String strH;
        List listD1;
        try {
            strH = y520.H((File) genVar.h.getValue());
        } catch (IOException unused) {
            genVar.g = false;
            strH = null;
        }
        if (strH == null) {
            return 0L;
        }
        int length = strH.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z2 = u890.q(strH.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        List listH = i.h(strH.subSequence(i2, length + 1).toString());
        if (!listH.isEmpty()) {
            ListIterator listIterator = listH.listIterator(listH.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listD1 = z6x.a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    listD1 = o7h.d1(listH, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listD1 = z6x.a;
            break;
        }
        String[] strArr = (String[]) listD1.toArray(new String[0]);
        try {
            return (long) ((Long.parseLong(strArr[13]) + Long.parseLong(strArr[14]) + Long.parseLong(strArr[15]) + Long.parseLong(strArr[16])) * genVar.d);
        } catch (NumberFormatException unused2) {
            ike1.a.q("Error parsing /proc/self/stat file.", new Object[0]);
            return 0L;
        }
    }
}
