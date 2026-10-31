package androidx.car.app;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.constraints.IConstraintHost;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.navigation.INavigationHost;
import androidx.car.app.suggestion.ISuggestionHost;
import java.security.InvalidParameterException;
import java.util.Objects;
import p.pw60;
import p.sge1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l {
    public ICarHost a;
    public IAppHost b;
    public IConstraintHost c;
    public INavigationHost d;
    public ISuggestionHost e;
    public IMediaPlaybackHost f;

    public final void a(String str, String str2, pw60 pw60Var) {
        try {
            try {
                try {
                    Log.isLoggable("CarApp", 3);
                    IInterface iInterfaceB = b(str);
                    if (iInterfaceB == null) {
                        return;
                    }
                    pw60Var.d(iInterfaceB);
                } catch (RuntimeException e) {
                    throw new HostException("Remote " + str2 + " call failed", e);
                }
            } catch (SecurityException e2) {
                throw e2;
            }
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final IInterface b(String str) {
        if (this.a == null) {
            return null;
        }
        try {
            switch (str.hashCode()) {
                case -1606703562:
                    if (str.equals("constraints")) {
                        IConstraintHost iConstraintHost = this.c;
                        if (iConstraintHost != null) {
                            return iConstraintHost;
                        }
                        try {
                            Log.isLoggable("CarApp", 3);
                            ICarHost iCarHost = this.a;
                            Objects.requireNonNull(iCarHost);
                            IConstraintHost iConstraintHostAsInterface = IConstraintHost.Stub.asInterface(iCarHost.getHost("constraints"));
                            this.c = iConstraintHostAsInterface;
                            return iConstraintHostAsInterface;
                        } catch (SecurityException e) {
                            throw e;
                        } catch (RuntimeException e2) {
                            throw new HostException("Remote getHost(Constraints) call failed", e2);
                        }
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                case 96801:
                    if (str.equals("app")) {
                        IAppHost iAppHost = this.b;
                        if (iAppHost != null) {
                            return iAppHost;
                        }
                        try {
                            Log.isLoggable("CarApp", 3);
                            ICarHost iCarHost2 = this.a;
                            Objects.requireNonNull(iCarHost2);
                            IAppHost iAppHostAsInterface = IAppHost.Stub.asInterface(iCarHost2.getHost("app"));
                            this.b = iAppHostAsInterface;
                            return iAppHostAsInterface;
                        } catch (SecurityException e3) {
                            throw e3;
                        } catch (RuntimeException e4) {
                            throw new HostException("Remote getHost(App) call failed", e4);
                        }
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                case 98260:
                    if (str.equals("car")) {
                        return this.a;
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                case 1197722116:
                    if (str.equals("suggestion")) {
                        ISuggestionHost iSuggestionHost = this.e;
                        if (iSuggestionHost != null) {
                            return iSuggestionHost;
                        }
                        try {
                            Log.isLoggable("CarApp", 3);
                            ICarHost iCarHost3 = this.a;
                            Objects.requireNonNull(iCarHost3);
                            ISuggestionHost iSuggestionHostAsInterface = ISuggestionHost.Stub.asInterface(iCarHost3.getHost("suggestion"));
                            this.e = iSuggestionHostAsInterface;
                            return iSuggestionHostAsInterface;
                        } catch (SecurityException e5) {
                            throw e5;
                        } catch (RuntimeException e6) {
                            throw new HostException("Remote getHost(Suggestion) call failed", e6);
                        }
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                case 1569536022:
                    if (str.equals("media_playback")) {
                        IMediaPlaybackHost iMediaPlaybackHost = this.f;
                        if (iMediaPlaybackHost != null) {
                            return iMediaPlaybackHost;
                        }
                        try {
                            Log.isLoggable("CarApp", 3);
                            ICarHost iCarHost4 = this.a;
                            Objects.requireNonNull(iCarHost4);
                            IMediaPlaybackHost iMediaPlaybackHostAsInterface = IMediaPlaybackHost.Stub.asInterface(iCarHost4.getHost("media_playback"));
                            this.f = iMediaPlaybackHostAsInterface;
                            return iMediaPlaybackHostAsInterface;
                        } catch (SecurityException e7) {
                            throw e7;
                        } catch (RuntimeException e8) {
                            throw new HostException("Remote getHost(Media) call failed", e8);
                        }
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                case 1862666772:
                    if (str.equals("navigation")) {
                        INavigationHost iNavigationHost = this.d;
                        if (iNavigationHost != null) {
                            return iNavigationHost;
                        }
                        try {
                            Log.isLoggable("CarApp", 3);
                            ICarHost iCarHost5 = this.a;
                            Objects.requireNonNull(iCarHost5);
                            INavigationHost iNavigationHostAsInterface = INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                            this.d = iNavigationHostAsInterface;
                            return iNavigationHostAsInterface;
                        } catch (SecurityException e9) {
                            throw e9;
                        } catch (RuntimeException e10) {
                            throw new HostException("Remote getHost(Navigation) call failed", e10);
                        }
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                default:
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
            }
        } catch (HostException unused) {
            return null;
        }
    }

    public final void c() {
        sge1.a();
        this.a = null;
        this.b = null;
        this.d = null;
    }
}
