package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class avd {
    public final String a;
    public final String b;
    public final yud c;
    public final dvd d;

    public avd(String str, String str2, yud yudVar, dvd dvdVar) {
        this.a = str;
        this.b = str2;
        this.c = yudVar;
        this.d = dvdVar;
    }

    public static avd a(avd avdVar, String str, cvd cvdVar, int i) {
        String str2 = avdVar.a;
        if ((i & 2) != 0) {
            str = avdVar.b;
        }
        yud yudVar = avdVar.c;
        dvd dvdVar = cvdVar;
        if ((i & 8) != 0) {
            dvdVar = avdVar.d;
        }
        return new avd(str2, str, yudVar, dvdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avd)) {
            return false;
        }
        avd avdVar = (avd) obj;
        return this.a.equals(avdVar.a) && u890.j(this.b, avdVar.b) && u890.j(this.c, avdVar.c) && this.d.equals(avdVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        yud yudVar = this.c;
        return this.d.hashCode() + ((iHashCode2 + (yudVar != null ? yudVar.hashCode() : 0)) * 31);
    }
}
