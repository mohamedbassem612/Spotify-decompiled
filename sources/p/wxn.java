package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wxn {
    public static final wxn a;
    public static final wxn b;
    public static final /* synthetic */ wxn[] c;

    static {
        wxn wxnVar = new wxn("AI_PERSONA", 0);
        a = wxnVar;
        wxn wxnVar2 = new wxn("AI_PERSONA_LIKELY", 1);
        b = wxnVar2;
        c = new wxn[]{wxnVar, wxnVar2};
    }

    public static wxn valueOf(String str) {
        return (wxn) Enum.valueOf(wxn.class, str);
    }

    public static wxn[] values() {
        return (wxn[]) c.clone();
    }
}
