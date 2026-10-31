package p;

import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w6b1 {
    public static final Pattern j;
    public static final Pattern k;
    public static final Pattern l;
    public static final Pattern m;
    public final String a;
    public final blc0 b;
    public final List c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final List h;
    public final List i;

    static {
        Pattern.compile("\\=|\\&");
        j = Pattern.compile(":");
        k = Pattern.compile("\\?");
        l = Pattern.compile("#");
        m = Pattern.compile("/");
    }

    public w6b1(String str, blc0 blc0Var, List list, String str2, boolean z, int i) {
        int i2 = i & 4;
        z6x z6xVar = z6x.a;
        list = i2 != 0 ? z6xVar : list;
        String str3 = (i & 128) != 0 ? null : "";
        String str4 = (i & 256) != 0 ? null : "";
        this.a = str;
        this.b = blc0Var;
        this.c = list;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = str4;
        this.h = z6xVar;
        this.i = z6xVar;
    }

    public final String toString() {
        return "mLinkName = " + this.a + ", pattern = " + this.c + ", verifier = " + this.d + ", mLinkType = " + this.b + ", mParentLinkType = null, mIsPublic = " + this.e + ", mOwner = " + this.f + ", mDescription = " + this.g + ", mExamples = " + this.h + ", mCounterExamples = " + this.i;
    }
}
