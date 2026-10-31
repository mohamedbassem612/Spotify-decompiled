package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class yin implements FilenameFilter {
    public final /* synthetic */ byte a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return str.startsWith("event") && !str.endsWith("_");
            case 1:
                return Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1))).matcher(str).matches();
            case 2:
                return Pattern.compile(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3))).matcher(str).matches();
            case 3:
                return Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1))).matcher(str).matches();
            case 4:
                return Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1))).matcher(str).matches();
            default:
                return Pattern.matches("cpu[0-9]+", str);
        }
    }
}
