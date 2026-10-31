package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fpb {
    public final /* synthetic */ byte a = 2;
    public final String b;
    public final String c;

    public fpb(String str, String str2, String str3, ArrayList arrayList) {
        this.b = str;
        this.c = str2;
        if (arrayList.contains(str3)) {
            return;
        }
        hhg1.n("Invalid value for this property model.");
        throw null;
    }

    public fpb(String str, String str2, int i, int i2, int i3) {
        this.b = str;
        this.c = str2;
        if (i2 > i || i > i3) {
            hhg1.n("Invalid value for this property model.");
            throw null;
        }
    }

    public fpb(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
    }
}
