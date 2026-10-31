package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class qrv0 {
    public static final bma1 a;
    public static final bma1 b;
    public static final bma1 c;
    public static final bma1 d;
    public static final bma1 e;
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;

    static {
        nbc nbcVar = bma1.b;
        a = nbcVar.q("debug_tools_premium_destination_date_override");
        b = nbcVar.q("debug_tools_premium_destination_locale_override");
        c = nbcVar.q("debug_tools_premium_destination_eligibility_override");
        d = nbcVar.q("debug_tools_premium_destination_build_model_override");
        e = nbcVar.q("debug_tools_premium_destination_environment_override");
        f = nbcVar.q("debug_tools_premium_destination_experimental_resourceid");
        g = nbcVar.q("debug_tools_premium_destination_override_header_offer_utc_stop_date");
        h = nbcVar.q("debug_tools_premium_destination_local_template_override");
    }
}
