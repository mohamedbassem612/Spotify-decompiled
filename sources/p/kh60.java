package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kh60 {
    public final en31 a;
    public final lmd b = new lmd(this, (byte) 4);
    public final idd1 c;

    public kh60(en31 en31Var) {
        this.c = new idd1(new mmd(en31Var, (byte) 4));
        this.a = en31Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        switch (str.hashCode()) {
            case -1632865838:
                if (str.equals("PLAYLIST")) {
                    return 7;
                }
                break;
            case -1319760993:
                if (str.equals("AUDIOBOOK")) {
                    return 3;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    return 1;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    return 6;
                }
                break;
            case 80083243:
                if (str.equals("TRACK")) {
                    return 9;
                }
                break;
            case 81556047:
                if (str.equals("VENUE")) {
                    return 12;
                }
                break;
            case 408556937:
                if (str.equals("PROFILE")) {
                    return 8;
                }
                break;
            case 1669006982:
                if (str.equals("CONCERT")) {
                    return 11;
                }
                break;
            case 1868332626:
                if (str.equals("AUDIO_EPISODE")) {
                    return 4;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    return 2;
                }
                break;
            case 1941968267:
                if (str.equals("AUTHOR")) {
                    return 10;
                }
                break;
            case 2063976934:
                if (str.equals("AUDIO_SHOW")) {
                    return 5;
                }
                break;
        }
        hhg1.n("Can't convert value to enum, unknown value: ".concat(str));
        return 0;
    }
}
