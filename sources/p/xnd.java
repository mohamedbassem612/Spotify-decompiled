package p;

import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class xnd implements dkl {
    public final /* synthetic */ byte a;

    public /* synthetic */ xnd(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:194:0x0394  */
    /* JADX WARN: Code duplicated, block: B:204:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0182  */
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        boolean zContains;
        boolean z5 = false;
        switch (this.a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                w8p1.m();
                throw null;
            case 1:
                if (obj != null) {
                    throw new ClassCastException();
                }
                w8p1.m();
                throw null;
            case 2:
                w8p1.m();
                return;
            case 3:
                ygz0 ygz0Var = (ygz0) obj;
                ArrayList arrayList = new ArrayList();
                String str2 = Build.BRAND;
                if (("HUAWEI".equalsIgnoreCase(str2) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str2) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
                    z = true;
                } else {
                    String str3 = Build.FINGERPRINT;
                    if (!str3.startsWith("generic") && !str3.startsWith("unknown")) {
                        String str4 = Build.MODEL;
                        if (!str4.contains("google_sdk") && !str4.contains("Emulator") && !str4.contains("Cuttlefish") && !str4.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!str2.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk"))) {
                            Build.HARDWARE.contains("ranchu");
                        }
                    }
                    z = false;
                }
                if (ygz0Var.a(ImageCaptureRotationOptionQuirk.class, z)) {
                    arrayList.add(new ImageCaptureRotationOptionQuirk());
                }
                if (ygz0Var.a(SurfaceOrderQuirk.class, true)) {
                    arrayList.add(new SurfaceOrderQuirk());
                }
                HashSet hashSet = CaptureFailedRetryQuirk.a;
                Locale locale = Locale.US;
                String upperCase = str2.toUpperCase(locale);
                String str5 = Build.MODEL;
                if (ygz0Var.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.a.contains(Pair.create(upperCase, str5.toUpperCase(locale))))) {
                    arrayList.add(new CaptureFailedRetryQuirk());
                }
                if (ygz0Var.a(LowMemoryQuirk.class, LowMemoryQuirk.a.contains(str5.toUpperCase(locale)))) {
                    arrayList.add(new LowMemoryQuirk());
                }
                HashSet hashSet2 = LargeJpegImageQuirk.a;
                if (ygz0Var.a(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str2) || ("Vivo".equalsIgnoreCase(str2) && LargeJpegImageQuirk.a.contains(str5.toUpperCase(locale))))) {
                    arrayList.add(new LargeJpegImageQuirk());
                }
                HashSet hashSet3 = IncorrectJpegMetadataQuirk.a;
                if ("Samsung".equalsIgnoreCase(str2) && IncorrectJpegMetadataQuirk.a.contains(Build.DEVICE.toUpperCase(locale))) {
                    z5 = true;
                }
                if (ygz0Var.a(IncorrectJpegMetadataQuirk.class, z5)) {
                    arrayList.add(new IncorrectJpegMetadataQuirk());
                }
                tvt.a = new g4r((List) arrayList);
                "core DeviceQuirks = ".concat(g4r.o(tvt.a));
                j2h1.o("DeviceQuirks");
                return;
            case 4:
                ygz0 ygz0Var2 = (ygz0) obj;
                ArrayList arrayList2 = new ArrayList();
                if (Build.VERSION.SDK_INT < 33) {
                    String str6 = Build.MANUFACTURER;
                    if ("SAMSUNG".equalsIgnoreCase(str6)) {
                        String str7 = Build.DEVICE;
                        if (!"F2Q".equalsIgnoreCase(str7) && !"Q2Q".equalsIgnoreCase(str7)) {
                            if (("OPPO".equalsIgnoreCase(str6) || !"OP4E75L1".equalsIgnoreCase(Build.DEVICE)) && (!"LENOVO".equalsIgnoreCase(str6) || !"Q706F".equalsIgnoreCase(Build.DEVICE))) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    } else if ("OPPO".equalsIgnoreCase(str6)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (ygz0Var2.a(SurfaceViewStretchedQuirk.class, z2)) {
                    arrayList2.add(new SurfaceViewStretchedQuirk());
                }
                if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL)) {
                    z5 = true;
                }
                if (ygz0Var2.a(SurfaceViewNotCroppedByParentQuirk.class, z5)) {
                    arrayList2.add(new SurfaceViewNotCroppedByParentQuirk());
                }
                uvt.a = new g4r((List) arrayList2);
                "view DeviceQuirks = ".concat(g4r.o(uvt.a));
                j2h1.o("DeviceQuirks");
                return;
            default:
                ygz0 ygz0Var3 = (ygz0) obj;
                ArrayList arrayList3 = new ArrayList();
                List list = ImageCapturePixelHDRPlusQuirk.a;
                String str8 = Build.MODEL;
                if (ygz0Var3.a(ImageCapturePixelHDRPlusQuirk.class, list.contains(str8) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26)) {
                    arrayList3.add(new ImageCapturePixelHDRPlusQuirk());
                }
                if (ygz0Var3.a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.c())) {
                    arrayList3.add(new ExtraCroppingQuirk());
                }
                List list2 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                String str9 = Build.BRAND;
                "GOOGLE".equalsIgnoreCase(str9);
                if (ygz0Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                    arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                }
                if (ygz0Var3.a(ExcludedSupportedSizesQuirk.class, ("OnePlus".equalsIgnoreCase(str9) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) || ("OnePlus".equalsIgnoreCase(str9) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) || (("HUAWEI".equalsIgnoreCase(str9) && "HWANE".equalsIgnoreCase(Build.DEVICE)) || ExcludedSupportedSizesQuirk.c() || ExcludedSupportedSizesQuirk.b() || ("REDMI".equalsIgnoreCase(str9) && "joyeuse".equalsIgnoreCase(Build.DEVICE))))) {
                    arrayList3.add(new ExcludedSupportedSizesQuirk());
                }
                List list3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a;
                Locale locale2 = Locale.US;
                if (ygz0Var3.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list3.contains(str8.toUpperCase(locale2)))) {
                    arrayList3.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
                }
                List list4 = PreviewPixelHDRnetQuirk.a;
                String str10 = Build.MANUFACTURER;
                if (ygz0Var3.a(PreviewPixelHDRnetQuirk.class, "Google".equals(str10) && PreviewPixelHDRnetQuirk.a.contains(Build.DEVICE.toLowerCase(Locale.getDefault())))) {
                    arrayList3.add(new PreviewPixelHDRnetQuirk());
                }
                if (ygz0Var3.a(StillCaptureFlashStopRepeatingQuirk.class, "SAMSUNG".equals(str10.toUpperCase(locale2)) && str8.toUpperCase(locale2).startsWith("SM-A716"))) {
                    arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                }
                g3d1 g3d1Var = ExtraSupportedSurfaceCombinationsQuirk.a;
                String str11 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str11) || "heroqltetmo".equalsIgnoreCase(str11)) {
                    z3 = true;
                } else {
                    if ("google".equalsIgnoreCase(str9)) {
                        zContains = ExtraSupportedSurfaceCombinationsQuirk.c.contains(str8.toUpperCase(locale2));
                    } else {
                        zContains = false;
                    }
                    if (zContains || ExtraSupportedSurfaceCombinationsQuirk.b()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (ygz0Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z3)) {
                    arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                }
                if (ygz0Var3.a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.a.contains(new Pair(str10.toLowerCase(locale2), str8.toLowerCase(locale2))))) {
                    arrayList3.add(new FlashAvailabilityBufferUnderflowQuirk());
                }
                if (ygz0Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, "Huawei".equalsIgnoreCase(str9) && "mha-l29".equalsIgnoreCase(str8))) {
                    arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                }
                if (ygz0Var3.a(TextureViewIsClosedQuirk.class, false)) {
                    arrayList3.add(new TextureViewIsClosedQuirk());
                }
                if (ygz0Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                    arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                }
                if (ygz0Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.a.contains(str8.toLowerCase(locale2)))) {
                    arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                }
                List list5 = ZslDisablerQuirk.a;
                if (ygz0Var3.a(ZslDisablerQuirk.class, ("samsung".equalsIgnoreCase(str9) && ZslDisablerQuirk.b(ZslDisablerQuirk.a)) || ("xiaomi".equalsIgnoreCase(str9) && ZslDisablerQuirk.b(ZslDisablerQuirk.b)))) {
                    arrayList3.add(new ZslDisablerQuirk());
                }
                if (ygz0Var3.a(ExtraSupportedOutputSizeQuirk.class, "motorola".equalsIgnoreCase(str9) && "moto e5 play".equalsIgnoreCase(str8))) {
                    arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                }
                List list6 = InvalidVideoProfilesQuirk.a;
                if ("samsung".equalsIgnoreCase(str9) && Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a")) {
                    z4 = true;
                } else {
                    List list7 = InvalidVideoProfilesQuirk.a;
                    Locale locale3 = Locale.ROOT;
                    if (list7.contains(str8.toLowerCase(locale3))) {
                        String str12 = Build.ID;
                        if (str12.toLowerCase(locale3).startsWith("tp1a") || str12.toLowerCase(locale3).startsWith("td1a")) {
                            z4 = true;
                        } else if (!"redmi".equalsIgnoreCase(str9) || "xiaomi".equalsIgnoreCase(str9)) {
                            str = Build.ID;
                            if (!str.toLowerCase(locale3).startsWith("tkq1") || str.toLowerCase(locale3).startsWith("tp1a")) {
                                z4 = true;
                            } else if ((!InvalidVideoProfilesQuirk.b.contains(str8.toLowerCase(locale3)) && Build.VERSION.SDK_INT == 33) || (InvalidVideoProfilesQuirk.c.contains(str8.toLowerCase(locale3)) && Build.VERSION.SDK_INT == 33)) {
                                z4 = true;
                            }
                        } else {
                            z4 = !InvalidVideoProfilesQuirk.b.contains(str8.toLowerCase(locale3)) ? false : false;
                        }
                    } else {
                        if ("redmi".equalsIgnoreCase(str9)) {
                            str = Build.ID;
                            if (str.toLowerCase(locale3).startsWith("tkq1")) {
                            }
                        } else {
                            str = Build.ID;
                            if (str.toLowerCase(locale3).startsWith("tkq1")) {
                            }
                        }
                        z4 = true;
                    }
                }
                if (ygz0Var3.a(InvalidVideoProfilesQuirk.class, z4)) {
                    arrayList3.add(new InvalidVideoProfilesQuirk());
                }
                if (ygz0Var3.a(Preview3AThreadCrashQuirk.class, "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE))) {
                    arrayList3.add(new Preview3AThreadCrashQuirk());
                }
                if (ygz0Var3.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.a.containsKey(str8.toUpperCase(locale2)))) {
                    arrayList3.add(new SmallDisplaySizeQuirk());
                }
                if ("google".equalsIgnoreCase(str9) && Build.VERSION.SDK_INT >= 35) {
                    z5 = true;
                }
                if (ygz0Var3.a(CaptureSessionShouldUseMrirQuirk.class, z5)) {
                    arrayList3.add(new CaptureSessionShouldUseMrirQuirk());
                }
                vvt.a = new g4r((List) arrayList3);
                "camera2 DeviceQuirks = ".concat(g4r.o(vvt.a));
                j2h1.o("DeviceQuirks");
                return;
        }
    }
}
