# Contributing to Coffee Shop Management System

Thank you for your interest in contributing to this project! We welcome contributions from the community.

## How to Contribute

### Reporting Bugs

If you find a bug, please create an issue with:
- A clear description of the bug
- Steps to reproduce
- Expected behavior
- Actual behavior
- Screenshots (if applicable)
- Device/Android version information

### Suggesting Features

We welcome feature suggestions! Please create an issue with:
- A clear description of the feature
- Use cases and benefits
- Any relevant examples or mockups

### Pull Requests

1. **Fork the repository**
   ```bash
   git clone https://github.com/sonnt6822/coffeeshop.git
   ```

2. **Create a feature branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Make your changes**
   - Follow the existing code style
   - Add comments for complex logic
   - Test your changes thoroughly

4. **Commit your changes**
   ```bash
   git commit -m "Add: Brief description of your changes"
   ```
   
   Use these commit prefixes:
   - `Add:` for new features
   - `Fix:` for bug fixes
   - `Update:` for updates to existing features
   - `Remove:` for removing code/files
   - `Refactor:` for code refactoring
   - `Docs:` for documentation changes

5. **Push to your fork**
   ```bash
   git push origin feature/your-feature-name
   ```

6. **Create a Pull Request**
   - Provide a clear description of your changes
   - Reference any related issues
   - Include screenshots for UI changes

## Code Style Guidelines

### Java Code Style

- Use 4 spaces for indentation (not tabs)
- Follow Java naming conventions:
  - Classes: PascalCase (`UserActivity`, `DatabaseHelper`)
  - Methods: camelCase (`getUserName()`, `saveData()`)
  - Variables: camelCase (`userName`, `totalPrice`)
  - Constants: UPPER_SNAKE_CASE (`MAX_ITEMS`, `DEFAULT_PRICE`)
- Add meaningful comments for complex logic
- Keep methods small and focused

### XML Layout Style

- Use meaningful IDs (`btn_submit`, `tv_title`, `et_username`)
- Group related attributes together
- Use proper indentation (4 spaces)
- Follow Material Design guidelines

### Database Changes

If you modify the database:
- Update the database version in `DbHelper.java`
- Provide migration logic in `onUpgrade()`
- Document changes in your PR

## Testing

- Test your changes on different Android versions (API 28+)
- Test on different screen sizes
- Verify that existing features still work
- Test both manager and employee accounts

## Areas for Contribution

We especially welcome contributions in these areas:

### Security Improvements
- [ ] Implement password encryption
- [ ] Add input validation and sanitization
- [ ] Secure storage for sensitive data
- [ ] Implement session management

### Features
- [ ] Invoice printing functionality
- [ ] Electronic payment integration
- [ ] Database backup and restore
- [ ] Multi-language support (English, Vietnamese)
- [ ] Dark mode theme
- [ ] Sales reports and charts
- [ ] Customer management
- [ ] Loyalty program

### UI/UX Improvements
- [ ] Improve error messages
- [ ] Add loading indicators
- [ ] Enhance animation and transitions
- [ ] Improve accessibility
- [ ] Responsive layouts for tablets

### Code Quality
- [ ] Add unit tests
- [ ] Add UI tests
- [ ] Code refactoring
- [ ] Performance optimization
- [ ] Documentation improvements

## Questions?

If you have questions, feel free to:
- Create an issue
- Contact the maintainers:
  - duc43059@gmail.com
  - vkhoa30102004@gmail.com

## Code of Conduct

- Be respectful and inclusive
- Welcome newcomers
- Accept constructive criticism
- Focus on what's best for the project

Thank you for contributing! 🎉
