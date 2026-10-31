package p;

import android.graphics.Bitmap;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.scrollsita.v1.Section;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h0x0 extends hab0 implements Function0 {
    public static final h0x0 N0;
    public static final h0x0 O0;
    public static final h0x0 P0;
    public static final h0x0 Q0;
    public static final h0x0 R0;
    public static final h0x0 S0;
    public static final h0x0 T0;
    public static final h0x0 U0;
    public static final h0x0 V0;
    public static final h0x0 W0;
    public static final h0x0 X;
    public static final h0x0 X0;
    public static final h0x0 Y;
    public static final h0x0 Y0;
    public static final h0x0 Z;
    public static final h0x0 Z0;
    public static final h0x0 a1;
    public static final h0x0 b;
    public static final h0x0 b1;
    public static final h0x0 c;
    public static final h0x0 c1;
    public static final h0x0 d;
    public static final h0x0 d1;
    public static final h0x0 e;
    public static final h0x0 e1;
    public static final h0x0 f;
    public static final h0x0 g;
    public static final h0x0 h;
    public static final h0x0 i;
    public static final h0x0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new h0x0(i2, (byte) 0);
        c = new h0x0(i2, (byte) 1);
        d = new h0x0(i2, (byte) 2);
        e = new h0x0(i2, (byte) 3);
        f = new h0x0(i2, (byte) 4);
        g = new h0x0(i2, (byte) 5);
        h = new h0x0(i2, (byte) 6);
        i = new h0x0(i2, (byte) 7);
        t = new h0x0(i2, (byte) 8);
        X = new h0x0(i2, (byte) 9);
        Y = new h0x0(i2, (byte) 10);
        Z = new h0x0(i2, (byte) 11);
        N0 = new h0x0(i2, (byte) 12);
        O0 = new h0x0(i2, (byte) 13);
        P0 = new h0x0(i2, (byte) 14);
        Q0 = new h0x0(i2, (byte) 15);
        R0 = new h0x0(i2, (byte) 16);
        S0 = new h0x0(i2, (byte) 17);
        T0 = new h0x0(i2, (byte) 18);
        U0 = new h0x0(i2, (byte) 19);
        V0 = new h0x0(i2, (byte) 20);
        W0 = new h0x0(i2, (byte) 21);
        X0 = new h0x0(i2, (byte) 22);
        Y0 = new h0x0(i2, (byte) 23);
        Z0 = new h0x0(i2, (byte) 24);
        a1 = new h0x0(i2, (byte) 25);
        b1 = new h0x0(i2, (byte) 26);
        c1 = new h0x0(i2, (byte) 27);
        d1 = new h0x0(i2, (byte) 28);
        e1 = new h0x0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0x0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
            case 1:
                return rih1Var;
            case 2:
                return new tpl0();
            case 3:
                return new hql0();
            case 4:
                return new jql0();
            case 5:
                return new pql0();
            case 6:
                return new sql0();
            case 7:
                return new uql0();
            case 8:
            case 9:
                return rih1Var;
            case 10:
                return v8r.q(Boolean.FALSE);
            case 11:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 12:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 13:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 14:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 15:
                return Boolean.FALSE;
            case 16:
                return dm61.t0(new String[]{"_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca"});
            case 17:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                return bitmapCreateBitmap;
            case 18:
                return new r36(xmy0.a, (byte) 0);
            case 19:
                return new r36(umy0.a, (byte) 0);
            case 20:
                return new r36(chc1.a, (byte) 0);
            case 21:
                chc1 chc1Var = chc1.a;
                return new nlc0(chc1Var, chc1Var);
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
            case 28:
                return rih1Var;
            default:
                return new r36(pez0.a, (byte) 0);
        }
    }
}
