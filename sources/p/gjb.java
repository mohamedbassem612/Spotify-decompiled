package p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gjb implements akb {
    public final rku N0;
    public final rku O0;
    public final BehaviorSubject X;
    public final BehaviorSubject Y;
    public final PublishSubject Z;
    public final rjb a;
    public final Scheduler b;
    public final int c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final Set g = Collections.synchronizedSet(new LinkedHashSet());
    public boolean h = true;
    public final e72 i = new e72(this, (byte) 1);
    public final Subject t;

    public gjb(rjb rjbVar, Scheduler scheduler, int i, boolean z, int i2, boolean z2) {
        this.a = rjbVar;
        this.b = scheduler;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = z2;
        Subject subjectC = new PublishSubject().c();
        this.t = subjectC;
        w7x w7xVar = w7x.a;
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(w7xVar);
        this.X = behaviorSubjectG;
        this.Y = BehaviorSubject.g(xib.a);
        this.Z = new PublishSubject();
        this.N0 = new rku();
        this.O0 = new rku();
        subjectC.observeOn(scheduler).scan(w7xVar, wdu0.g).distinctUntilChanged().subscribeOn(scheduler).subscribe(behaviorSubjectG);
    }

    public static void c(Function0 function0) {
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new g54(function0, (byte) 3));
        }
    }

    public final void a() {
        if (!this.g.contains("social_radar")) {
            n57.e("Identifier social_radar must have been previously enabled in order to cancel a scan request with it!");
        } else {
            this.t.onNext(new ajb());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void b() throws NoWhenBranchMatchedException {
        if (this.d) {
            BehaviorSubject behaviorSubject = this.Y;
            if (behaviorSubject == null) {
                behaviorSubject = null;
            }
            if (u890.j(behaviorSubject != null ? (zib) behaviorSubject.h() : null, yib.a)) {
                g();
                f();
            }
        }
    }

    public final Observable d() {
        if (!this.g.contains("social_radar")) {
            n57.e("Identifier social_radar must have been previously enabled in order to be notified of scanned devices with it!");
            return Observable.empty();
        }
        return this.Z.withLatestFrom(this.X, ns80.P0).subscribeOn(this.b).filter(new ejb((byte) 0)).map(bya0.Z);
    }

    public final Observable e() {
        if (this.g.contains("social_radar")) {
            return Observable.combineLatest(this.X, this.Y, new fjb(this, (byte) 0)).subscribeOn(this.b).distinctUntilChanged(olj0.Z);
        }
        n57.e("Identifier social_radar must have been previously enabled in order to monitor the scanning events with it!");
        return Observable.empty();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void f() throws NoWhenBranchMatchedException {
        int iC;
        Observable observableJust;
        int i = 1;
        boolean z = this.d && !this.h;
        if (z || (iC = l1d.C(this.c)) == 0) {
            i = 3;
        } else if (iC != 1) {
            if (iC != 2) {
                eg.o();
                return;
            }
            i = 2;
        }
        long j = z ? ((long) this.e) * 5000 : 0L;
        rjb rjbVar = this.a;
        BluetoothAdapter bluetoothAdapter = rjbVar.a;
        if (!(bluetoothAdapter != null ? bluetoothAdapter.isEnabled() : false)) {
            observableJust = Observable.just(ijb.a);
            observableJust.getClass();
        } else if (Build.VERSION.SDK_INT < 31 || rjbVar.b.checkSelfPermission("android.permission.BLUETOOTH_SCAN") != 0) {
            observableJust = Observable.just(kjb.a);
            observableJust.getClass();
        } else if (rjbVar.g != null) {
            observableJust = Observable.just(hjb.a);
            observableJust.getClass();
        } else {
            observableJust = Observable.create(new qjb(rjbVar, i, j));
        }
        this.O0.b(observableJust.doOnNext(new mba(rjbVar, (byte) 7)).observeOn(this.b).subscribe(new xu((Object) this, (byte) 14), new fj9(this, (byte) 2)));
        this.Y.onNext(yib.a);
    }

    public final void g() {
        BluetoothLeScanner bluetoothLeScanner;
        rjb rjbVar = this.a;
        if (rjbVar.g != null) {
            BluetoothAdapter bluetoothAdapter = rjbVar.a;
            if (bluetoothAdapter != null && bluetoothAdapter.getState() == 12 && (bluetoothLeScanner = (BluetoothLeScanner) rjbVar.f.getValue()) != null) {
                bluetoothLeScanner.stopScan((ScanCallback) rjbVar.g);
            }
            rjbVar.g = null;
        }
        this.O0.a();
        this.Y.onNext(xib.a);
    }

    @Override // p.akb
    public final void start() {
        if (this.f) {
            this.N0.b(this.X.withLatestFrom(this.Y, mm10.S0).subscribeOn(this.b).subscribe(new fj9(this, (byte) 1)));
            c(new vv8(this, (byte) 24));
        }
    }

    @Override // p.akb
    public final void stop() {
        if (this.f) {
            c(new q30(this, (byte) 26));
            this.N0.a();
            this.t.onNext(bjb.a);
            g();
        }
    }
}
