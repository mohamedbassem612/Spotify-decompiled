package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.dxl1;
import p.dyb0;
import p.ec90;
import p.gwl1;
import p.gxl1;
import p.idd1;
import p.jd11;
import p.jnv0;
import p.lwl1;
import p.pwz0;
import p.rc11;
import p.ss0;
import p.tka0;
import p.uq21;
import p.xrj0;
import p.yct;
import p.z6x;
import p.zdd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class WorkDatabase_Impl extends WorkDatabase {
    public final idd1 l;
    public final idd1 m;
    public final idd1 n;
    public final idd1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final idd1 f1p;
    public final idd1 q;
    public final idd1 r;
    public final idd1 s;

    public WorkDatabase_Impl() {
        final byte b = 0;
        this.l = new idd1(new Function0(this) { // from class: p.qvl1
            public final /* synthetic */ WorkDatabase_Impl b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                WorkDatabase_Impl workDatabase_Impl = this.b;
                switch (b2) {
                    case 0:
                        return new dxl1(workDatabase_Impl);
                    case 1:
                        return new yct(workDatabase_Impl);
                    case 2:
                        return new gxl1(workDatabase_Impl);
                    case 3:
                        return new zdd1(workDatabase_Impl);
                    case 4:
                        return new gwl1(workDatabase_Impl);
                    case 5:
                        return new lwl1(workDatabase_Impl);
                    case 6:
                        return new jnv0(workDatabase_Impl);
                    default:
                        return new pwz0(workDatabase_Impl);
                }
            }
        });
        final byte b2 = 1;
        this.m = new idd1(new Function0(this) { // from class: p.qvl1
            public final /* synthetic */ WorkDatabase_Impl b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b2;
                WorkDatabase_Impl workDatabase_Impl = this.b;
                switch (b3) {
                    case 0:
                        return new dxl1(workDatabase_Impl);
                    case 1:
                        return new yct(workDatabase_Impl);
                    case 2:
                        return new gxl1(workDatabase_Impl);
                    case 3:
                        return new zdd1(workDatabase_Impl);
                    case 4:
                        return new gwl1(workDatabase_Impl);
                    case 5:
                        return new lwl1(workDatabase_Impl);
                    case 6:
                        return new jnv0(workDatabase_Impl);
                    default:
                        return new pwz0(workDatabase_Impl);
                }
            }
        });
        final byte b3 = 2;
        this.n = new idd1(new Function0(this) { // from class: p.qvl1
            public final /* synthetic */ WorkDatabase_Impl b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b4 = b3;
                WorkDatabase_Impl workDatabase_Impl = this.b;
                switch (b4) {
                    case 0:
                        return new dxl1(workDatabase_Impl);
                    case 1:
                        return new yct(workDatabase_Impl);
                    case 2:
                        return new gxl1(workDatabase_Impl);
                    case 3:
                        return new zdd1(workDatabase_Impl);
                    case 4:
                        return new gwl1(workDatabase_Impl);
                    case 5:
                        return new lwl1(workDatabase_Impl);
                    case 6:
                        return new jnv0(workDatabase_Impl);
                    default:
                        return new pwz0(workDatabase_Impl);
                }
            }
        });
        final byte b4 = 3;
        this.o = new idd1(new Function0(this) { // from class: p.qvl1
            public final /* synthetic */ WorkDatabase_Impl b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b5 = b4;
                WorkDatabase_Impl workDatabase_Impl = this.b;
                switch (b5) {
                    case 0:
                        return new dxl1(workDatabase_Impl);
                    case 1:
                        return new yct(workDatabase_Impl);
                    case 2:
                        return new gxl1(workDatabase_Impl);
                    case 3:
                        return new zdd1(workDatabase_Impl);
                    case 4:
                        return new gwl1(workDatabase_Impl);
                    case 5:
                        return new lwl1(workDatabase_Impl);
                    case 6:
                        return new jnv0(workDatabase_Impl);
                    default:
                        return new pwz0(workDatabase_Impl);
                }
            }
        });
        final byte b5 = 4;
        this.f1p = new idd1(new Function0(this) { // from class: p.qvl1
            public final /* synthetic */ WorkDatabase_Impl b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b6 = b5;
                WorkDatabase_Impl workDatabase_Impl = this.b;
                switch (b6) {
                    case 0:
                        return new dxl1(workDatabase_Impl);
                    case 1:
                        return new yct(workDatabase_Impl);
                    case 2:
                        return new gxl1(workDatabase_Impl);
                    case 3:
                        return new zdd1(workDatabase_Impl);
                    case 4:
                        return new gwl1(workDatabase_Impl);
                    case 5:
                        return new lwl1(workDatabase_Impl);
                    case 6:
                        return new jnv0(workDatabase_Impl);
                    default:
                        return new pwz0(workDatabase_Impl);
                }
            }
        });
        final byte b6 = 5;
        this.q = new idd1(new Function0(this) { // from class: p.qvl1
            public final /* synthetic */ WorkDatabase_Impl b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b7 = b6;
                WorkDatabase_Impl workDatabase_Impl = this.b;
                switch (b7) {
                    case 0:
                        return new dxl1(workDatabase_Impl);
                    case 1:
                        return new yct(workDatabase_Impl);
                    case 2:
                        return new gxl1(workDatabase_Impl);
                    case 3:
                        return new zdd1(workDatabase_Impl);
                    case 4:
                        return new gwl1(workDatabase_Impl);
                    case 5:
                        return new lwl1(workDatabase_Impl);
                    case 6:
                        return new jnv0(workDatabase_Impl);
                    default:
                        return new pwz0(workDatabase_Impl);
                }
            }
        });
        final byte b7 = 6;
        this.r = new idd1(new Function0(this) { // from class: p.qvl1
            public final /* synthetic */ WorkDatabase_Impl b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b8 = b7;
                WorkDatabase_Impl workDatabase_Impl = this.b;
                switch (b8) {
                    case 0:
                        return new dxl1(workDatabase_Impl);
                    case 1:
                        return new yct(workDatabase_Impl);
                    case 2:
                        return new gxl1(workDatabase_Impl);
                    case 3:
                        return new zdd1(workDatabase_Impl);
                    case 4:
                        return new gwl1(workDatabase_Impl);
                    case 5:
                        return new lwl1(workDatabase_Impl);
                    case 6:
                        return new jnv0(workDatabase_Impl);
                    default:
                        return new pwz0(workDatabase_Impl);
                }
            }
        });
        final byte b8 = 7;
        this.s = new idd1(new Function0(this) { // from class: p.qvl1
            public final /* synthetic */ WorkDatabase_Impl b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b9 = b8;
                WorkDatabase_Impl workDatabase_Impl = this.b;
                switch (b9) {
                    case 0:
                        return new dxl1(workDatabase_Impl);
                    case 1:
                        return new yct(workDatabase_Impl);
                    case 2:
                        return new gxl1(workDatabase_Impl);
                    case 3:
                        return new zdd1(workDatabase_Impl);
                    case 4:
                        return new gwl1(workDatabase_Impl);
                    case 5:
                        return new lwl1(workDatabase_Impl);
                    case 6:
                        return new jnv0(workDatabase_Impl);
                    default:
                        return new pwz0(workDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.work.impl.WorkDatabase
    public final dxl1 A() {
        return (dxl1) this.l.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gxl1 B() {
        return (gxl1) this.n.getValue();
    }

    @Override // p.en31
    public final List e(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xrj0((byte) 23));
        arrayList.add(new uq21((byte) 1));
        arrayList.add(new xrj0((byte) 24));
        arrayList.add(new xrj0((byte) 25));
        arrayList.add(new xrj0((byte) 26));
        arrayList.add(new uq21((byte) 2));
        arrayList.add(new xrj0((byte) 27));
        arrayList.add(new xrj0((byte) 28));
        arrayList.add(new xrj0((byte) 29));
        return arrayList;
    }

    @Override // p.en31
    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p.en31
    public final dyb0 g() {
        return new ss0(this);
    }

    @Override // p.en31
    public final Set k() {
        return new LinkedHashSet();
    }

    @Override // p.en31
    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jd11 jd11Var = rc11.a;
        tka0 tka0VarB = jd11Var.b(dxl1.class);
        z6x z6xVar = z6x.a;
        linkedHashMap.put(tka0VarB, z6xVar);
        linkedHashMap.put(jd11Var.b(yct.class), z6xVar);
        linkedHashMap.put(jd11Var.b(gxl1.class), z6xVar);
        linkedHashMap.put(jd11Var.b(zdd1.class), z6xVar);
        linkedHashMap.put(jd11Var.b(gwl1.class), z6xVar);
        linkedHashMap.put(jd11Var.b(lwl1.class), z6xVar);
        linkedHashMap.put(jd11Var.b(jnv0.class), z6xVar);
        linkedHashMap.put(jd11Var.b(pwz0.class), z6xVar);
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final yct u() {
        return (yct) this.m.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final jnv0 v() {
        return (jnv0) this.r.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pwz0 w() {
        return (pwz0) this.s.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final zdd1 x() {
        return (zdd1) this.o.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gwl1 y() {
        return (gwl1) this.f1p.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final lwl1 z() {
        return (lwl1) this.q.getValue();
    }
}
