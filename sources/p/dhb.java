package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dhb implements pdy0 {
    public final chb A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final luk G;
    public final idd1 H = new idd1(new vv8(this, (byte) 23));
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f26p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public dhb(boolean z, boolean z2, int i, int i2, int i3, boolean z3, int i4, int i5, boolean z4, int i6, int i7, int i8, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i9, boolean z13, int i10, int i11, int i12, int i13, chb chbVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z3;
        this.g = i4;
        this.h = i5;
        this.i = z4;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.f26p = z8;
        this.q = z9;
        this.r = z10;
        this.s = z11;
        this.t = z12;
        this.u = i9;
        this.v = z13;
        this.w = i10;
        this.x = i11;
        this.y = i12;
        this.z = i13;
        this.A = chbVar;
        this.B = z14;
        this.C = z15;
        this.D = z16;
        this.E = z17;
        this.F = z18;
        this.G = lukVar;
    }

    public final int A() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.A() : this.z;
    }

    public final chb B() {
        chb chbVarB;
        dhb dhbVarI = i();
        return (dhbVarI == null || (chbVarB = dhbVarI.B()) == null) ? this.A : chbVarB;
    }

    public final boolean C() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.C() : this.B;
    }

    public final boolean D() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.D() : this.C;
    }

    public final boolean E() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.E() : this.D;
    }

    public final boolean F() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.F() : this.E;
    }

    public final boolean G() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.G() : this.F;
    }

    public final boolean a() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.a() : this.a;
    }

    public final boolean b() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.b() : this.b;
    }

    public final int c() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.c() : this.c;
    }

    public final int d() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.d() : this.d;
    }

    public final int e() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.e() : this.e;
    }

    public final boolean f() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.f() : this.f;
    }

    public final int g() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.g() : this.g;
    }

    public final int h() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.h() : this.h;
    }

    public final dhb i() {
        return (dhb) this.H.getValue();
    }

    public final boolean j() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.j() : this.i;
    }

    public final int k() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.k() : this.j;
    }

    public final int l() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.l() : this.k;
    }

    public final int m() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.m() : this.l;
    }

    public final List models() {
        fpb fpbVar = new fpb("advertiser_async_write_delivery_enabled", "bluetooth-flags", a());
        fpb fpbVar2 = new fpb("android_device_type_enabled", "bluetooth-flags", b());
        fpb fpbVar3 = new fpb("background_report_delay_multiplier", "bluetooth-flags", c(), 1, 10);
        fpb fpbVar4 = new fpb("ble_discovery_snapshot_interval_millis", "bluetooth-flags", d(), 60000, 1800000);
        fpb fpbVar5 = new fpb("ble_discovery_snapshot_rssi_equality_threshold", "bluetooth-flags", e(), 1, 50);
        fpb fpbVar6 = new fpb("ble_enabled", "bluetooth-flags", f());
        fpb fpbVar7 = new fpb("ble_operations_timeout_ms", "bluetooth-flags", g(), 0, 3600000);
        fpb fpbVar8 = new fpb("characteristic_operation_logging_throttle_interval_seconds", "bluetooth-flags", h(), 60, 10800);
        fpb fpbVar9 = new fpb("deliver_power_state_broadcasts_in_background", "bluetooth-flags", j());
        fpb fpbVar10 = new fpb("discovered_device_reader_emission_debounce_millis", "bluetooth-flags", k(), 0, 60000);
        fpb fpbVar11 = new fpb("discovered_device_reader_eviction_interval_millis", "bluetooth-flags", l(), 0, 600000);
        fpb fpbVar12 = new fpb("discovered_device_reader_inactivity_timeout_millis", "bluetooth-flags", m(), 0, 600000);
        fpb fpbVar13 = new fpb("enable_ble_characteristic_operation_logging", "bluetooth-flags", n());
        fpb fpbVar14 = new fpb("enable_ble_discovery_snapshot", "bluetooth-flags", o());
        fpb fpbVar15 = new fpb("enable_debug_metrics", "bluetooth-flags", p());
        fpb fpbVar16 = new fpb("enable_low_power_on_background", "bluetooth-flags", q());
        fpb fpbVar17 = new fpb("enable_mtu_negotiation", "bluetooth-flags", r());
        fpb fpbVar18 = new fpb("gatt_read_offsets_enabled", "bluetooth-flags", s());
        fpb fpbVar19 = new fpb("include_additional_data_in_advertisement", "bluetooth-flags", t());
        fpb fpbVar20 = new fpb("pre_connection_capabilities_filtering_enabled", "bluetooth-flags", u());
        fpb fpbVar21 = new fpb("preferred_mtu", "bluetooth-flags", v(), 23, NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS);
        fpb fpbVar22 = new fpb("queued_writes_enabled", "bluetooth-flags", w());
        fpb fpbVar23 = new fpb("queued_writes_max_concurrent_connections", "bluetooth-flags", x(), 1, 8);
        fpb fpbVar24 = new fpb("remote_rssi_request_interval", "bluetooth-flags", y(), 500, 60000);
        fpb fpbVar25 = new fpb("required_samples", "bluetooth-flags", z(), 1, 30);
        fpb fpbVar26 = new fpb("sample_max_age_ms", "bluetooth-flags", A(), 500, 300000);
        String str = B().a;
        chb[] chbVarArrValues = chb.values();
        ArrayList arrayList = new ArrayList(chbVarArrValues.length);
        int length = chbVarArrValues.length;
        int i = 0;
        while (i < length) {
            int i2 = i;
            arrayList.add(chbVarArrValues[i2].a);
            i = i2 + 1;
        }
        return p7h.M(new fpb[]{fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, fpbVar6, fpbVar7, fpbVar8, fpbVar9, fpbVar10, fpbVar11, fpbVar12, fpbVar13, fpbVar14, fpbVar15, fpbVar16, fpbVar17, fpbVar18, fpbVar19, fpbVar20, fpbVar21, fpbVar22, fpbVar23, fpbVar24, fpbVar25, fpbVar26, new fpb("scan_mode", "bluetooth-flags", str, arrayList), new fpb("serialize_connection_events_enabled", "bluetooth-flags", C()), new fpb("strip_tagged_legacy_write_payloads", "bluetooth-flags", D()), new fpb("tap_over_ble_enabled", "bluetooth-flags", E()), new fpb("tap_over_ble_peripheral_enabled", "bluetooth-flags", F()), new fpb("unified_writable_characteristic_enabled", "bluetooth-flags", G())});
    }

    public final boolean n() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.n() : this.m;
    }

    public final boolean o() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.o() : this.n;
    }

    public final boolean p() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.p() : this.o;
    }

    public final boolean q() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.q() : this.f26p;
    }

    public final boolean r() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.r() : this.q;
    }

    public final boolean s() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.s() : this.r;
    }

    public final boolean t() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.t() : this.s;
    }

    public final boolean u() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.u() : this.t;
    }

    public final int v() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.v() : this.u;
    }

    public final boolean w() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.w() : this.v;
    }

    public final int x() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.x() : this.w;
    }

    public final int y() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.y() : this.x;
    }

    public final int z() {
        dhb dhbVarI = i();
        return dhbVarI != null ? dhbVarI.z() : this.y;
    }
}
